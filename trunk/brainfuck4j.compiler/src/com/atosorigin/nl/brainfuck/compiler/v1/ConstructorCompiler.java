/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.MethodCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Program;

/**
 * @author jeroen
 *
 */
public class ConstructorCompiler extends MethodCompiler {

	/**
	 * 
	 */
	public ConstructorCompiler() {
		super();
	}

	@Override
	protected MethodGen createMethod(CompilerContext ctx, Object instr, ConstantPoolGen cp, InstructionList il) {
		if (!(instr instanceof Program)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}
		Program program = (Program) instr;
		
		MethodGen constr = new MethodGen(
				Constants.ACC_PUBLIC,
				Type.VOID,
				Type.NO_ARGS,
				new String[0],
				Constants.CONSTRUCTOR_NAME,
				ctx.getClassName(),
				il,
				cp);
		// Stack: -> this
		il.append(InstructionFactory.createThis());
		// Stack: this -> 
		il.append(ctx.getFactory().createInvoke("java.lang.Object", 
				Constants.CONSTRUCTOR_NAME, 
				Type.VOID, 
				Type.NO_ARGS, 
				Constants.INVOKESPECIAL));
		// Stack: -> this
		il.append(InstructionFactory.createThis());
		// Stack: this -> this, heapsize
		il.append(ctx.getFactory().createConstant(program.getHeader().getHeap()));
		// Stack: this, heapsize -> this, arrayref
		il.append(ctx.getFactory().createNewArray(Type.INT, (short) ctx.getHeapType().getSize()));
		// Stack: this, arrayref -> 
		il.append(ctx.getFactory().createPutField(ctx.getClassName(), ctx.getHeap().getName(), ctx.getHeapType()));

		return constr;
	}

	@Override
	public int getMaxStack() {
		return 2;
	}

}
