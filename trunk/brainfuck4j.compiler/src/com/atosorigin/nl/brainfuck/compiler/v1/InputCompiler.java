/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.InstructionCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author jeroen
 *
 */
public class InputCompiler implements InstructionCompiler {

	/**
	 * 
	 */
	public InputCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, com.atosorigin.nl.brainfuck.Instruction)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		if (!instr.equals(Instruction.INPUT)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}

		ObjectType i_stream = new ObjectType("java.io.InputStream");

		// Stack : -> this
		ctx.append(InstructionFactory.createThis());
		// Stack : this -> arrayref
		ctx.append(ctx.getFactory().createFieldAccess(ctx.getClassName(), 
				ctx.getHeap().getName(), 
				ctx.getHeapType(),
				Constants.GETFIELD));
		// Stack: arrayref -> arrayref, index
		ctx.append(InstructionFactory.createLoad(ctx.getPointerType(), ctx.getPointerIdx()));
		// Stack : arrayref, index -> arrayref, index, objectref
		ctx.append(ctx.getFactory().createFieldAccess("java.lang.System", 
				"in", 
				i_stream,
		        Constants.GETSTATIC));
		// Stack: arrayref, index, objectref -> arrayref, index, value
		ctx.append(ctx.getFactory().createInvoke("java.io.InputStream", 
				"read", 
				Type.INT, 
				Type.NO_ARGS, 
				Constants.INVOKEVIRTUAL));
		// Stack: arrayref, index, value ->
		ctx.append(InstructionFactory.createArrayStore(ctx.getPointerType()));
	}

	@Override
	public int getMaxStack() {
		return 3;
	}

}
