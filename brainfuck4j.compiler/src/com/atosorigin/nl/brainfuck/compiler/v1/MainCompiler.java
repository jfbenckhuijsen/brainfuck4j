/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.MethodCompiler;

/**
 * @author jeroen
 *
 */
public class MainCompiler extends MethodCompiler {

	/**
	 * 
	 */
	public MainCompiler() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.MethodCompiler#createMethod(com.atosorigin.nl.brainfuck.compiler.CompilerContext, org.apache.bcel.generic.ConstantPoolGen, org.apache.bcel.generic.InstructionList)
	 */
	@Override
	protected MethodGen createMethod (CompilerContext ctx, Object instr, ConstantPoolGen cp, InstructionList il) {
		MethodGen main = new MethodGen(
				Constants.ACC_PUBLIC | Constants.ACC_STATIC, 
				Type.VOID,
				new Type[] {new ArrayType(Type.STRING, 1)},
				new String[]{"argv"},
				"main",
				ctx.getClassName(),
				il,
				cp);
		
		main.addException("java.io.IOException");
		
		// Stack: -> objectref
		il.append(ctx.getFactory().createNew(ctx.getClassName()));
		// Stack: objectref -> objectref, objectref
		il.append(InstructionConstants.DUP);
		// Stack: objectref, objectref -> objectref
		il.append(ctx.getFactory().createInvoke(ctx.getClassName(), 
					Constants.CONSTRUCTOR_NAME, 
					Type.VOID, 
					Type.NO_ARGS, 
					Constants.INVOKESPECIAL));
		LocalVariableGen instance = main.addLocalVariable(
				"instance", 
				new ObjectType(ctx.getClassName()), 
				null, 
				null);
		int instanceIdx = instance.getIndex();
		// Stack: objectref ->
		instance.setStart(il.append(new ASTORE(instanceIdx)));
		
		// Stack: -> objectref
		il.append(new ALOAD(instanceIdx));
		// Stack: objectref ->
		il.append(ctx.getFactory().createInvoke(ctx.getClassName(), 
				"execute", 
				Type.VOID, 
				Type.NO_ARGS, 
				Constants.INVOKEVIRTUAL));
		
		return main;
	}

}
