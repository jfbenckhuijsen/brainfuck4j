/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.jline;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.v1.ConstructorCompiler;

/**
 * @author a108600
 * 
 */
public class JlineConstructorCompiler extends ConstructorCompiler {

	/**
	 * 
	 */
	public JlineConstructorCompiler() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.atosorigin.nl.brainfuck.compiler.v1.ConstructorCompiler#createMethod
	 * (com.atosorigin.nl.brainfuck.compiler.base.CompilerContext,
	 * java.lang.Object, org.apache.bcel.generic.ConstantPoolGen,
	 * org.apache.bcel.generic.InstructionList)
	 */
	@Override
	protected MethodGen createMethod(CompilerContext ctx, Object instr,
			ConstantPoolGen cp, InstructionList il) {
		
		MethodGen mg = super.createMethod(ctx, instr, cp, il);

		ObjectType console = new ObjectType("jline.ConsoleReader");

		// Stack: -> this
		il.append(InstructionFactory.createThis());
		// Stack: this -> this, objectref
		il.append(ctx.getFactory().createNew(console));
		// Stack: this, objectref -> this, objectref, objectref
		il.append(InstructionFactory.createDup(1));
		// Stack: this, objectref, objectref -> this, objectref
		il.append(ctx.getFactory().createInvoke("jline.ConsoleReader", 
				Constants.CONSTRUCTOR_NAME, 
				Type.VOID, 
				Type.NO_ARGS, 
				Constants.INVOKESPECIAL));
		// Stack: this, objectref ->  
		il.append(ctx.getFactory().createPutField(ctx.getClassName(), "console", console));
		
		return mg; 
	}
}
