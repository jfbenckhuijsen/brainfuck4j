/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FieldGen;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.InstructionCompiler;

/**
 * @author jeroen
 *
 */
public class MemberCompiler implements InstructionCompiler {

	/**
	 * 
	 */
	public MemberCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, com.atosorigin.nl.brainfuck.Instruction)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		ConstantPoolGen cp = ctx.getConstantPool();
		FieldGen heapGen = new FieldGen(
				Constants.ACC_PRIVATE, 
				ctx.getHeapType(), 
				"heap", 
				cp);
		ctx.setHeap(heapGen.getField());
		ctx.getCg().addField(ctx.getHeap());
	}

	@Override
	public int getMaxStack() {
		return 0;
	}

}
