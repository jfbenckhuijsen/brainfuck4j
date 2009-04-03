/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.base;




/**
 * @author jeroen
 *
 */
public interface InstructionCompiler {

	/**
	 * @param ctx
	 * @param instr
	 * @return The first compiled instruction
	 */
	void compile (CompilerContext ctx, Object instr);

	/**
	 * @return
	 */
	int getMaxStack();
}
