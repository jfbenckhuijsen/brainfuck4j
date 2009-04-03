/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.generic.IFNE;
import org.apache.bcel.generic.InstructionHandle;

import com.atosorigin.nl.brainfuck.compiler.base.AbstractCompiler;
import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;

/**
 * @author a108600
 *
 */
public class LoopEndCompiler extends AbstractCompiler {

	/**
	 * 
	 */
	public LoopEndCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, java.lang.Object)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		// Stack: -> value
		InstructionHandle first = compileArrayGet(ctx);
		ctx.setBranchTarget(first);
		// Stack: value ->
		IFNE branch = new IFNE(null);
		ctx.append(branch);
		
		InstructionHandle target = ctx.popBranch();
		branch.setTarget(target);
	}

	@Override
	public int getMaxStack() {
		return 0;
	}

}
