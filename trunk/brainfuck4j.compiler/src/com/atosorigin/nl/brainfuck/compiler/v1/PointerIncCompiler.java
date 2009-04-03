/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.generic.IINC;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.InstructionCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author jeroen
 *
 */
public class PointerIncCompiler implements InstructionCompiler {

	/**
	 * 
	 */
	public PointerIncCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, com.atosorigin.nl.brainfuck.Instruction)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		if (!instr.equals(Instruction.INC_POINTER)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}
		
		// Stack: ->
		ctx.append(new IINC(ctx.getPointerIdx(), 1));
	}

	@Override
	public int getMaxStack() {
		return 0;
	}

}
