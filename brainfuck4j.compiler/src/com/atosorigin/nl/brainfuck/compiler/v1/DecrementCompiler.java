/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.DUP2;
import org.apache.bcel.generic.IADD;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.PUSH;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.InstructionCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author jeroen
 *
 */
public class DecrementCompiler implements InstructionCompiler {

	/**
	 * 
	 */
	public DecrementCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, com.atosorigin.nl.brainfuck.Instruction)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		if (!instr.equals(Instruction.DEC_VALUE)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}
		
		// Stack : -> this 
		ctx.append(InstructionFactory.createThis());
		// Stack : this -> arrayref
		ctx.append(ctx.getFactory().createFieldAccess(ctx.getClassName(), 
				ctx.getHeap().getName(), 
				ctx.getHeapType(),
				Constants.GETFIELD));
		// Stack: arrayref -> arrayref, index
		ctx.append(InstructionFactory.createLoad(ctx.getPointerType(), ctx.getPointerIdx()));
		// Stack: arrayref, index -> arrayref, index, arrayref, index
		ctx.append(new DUP2());
		// Stack: arrayref, index, arrayref, index -> arrayref, index, old_value
		ctx.append(InstructionFactory.createArrayLoad(ctx.getPointerType()));
		// Stack: arrayref, index, old_value -> arrayref, index, old_value, -1
		ctx.append(new PUSH(ctx.getConstantPool(), -1));
		// Stack: arrayref, index, old_value, -1 -> arrayref, index, new_value
		ctx.append(new IADD());
		// Stack: arrayref, index, new_value ->
		ctx.append(InstructionFactory.createArrayStore(ctx.getPointerType()));
	}

	@Override
	public int getMaxStack() {
		return 4;
	}

}
