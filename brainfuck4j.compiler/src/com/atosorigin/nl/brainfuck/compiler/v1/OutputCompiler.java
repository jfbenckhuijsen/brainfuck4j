/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.AbstractCompiler;
import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author jeroen
 *
 */
public class OutputCompiler extends AbstractCompiler {

	/**
	 * 
	 */
	public OutputCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, com.atosorigin.nl.brainfuck.Instruction)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		if (!instr.equals(Instruction.OUTPUT)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}
		ObjectType p_stream = new ObjectType("java.io.PrintStream");

		// Stack : -> objectref
		ctx.append(ctx.getFactory().createFieldAccess("java.lang.System", 
				"out", 
				p_stream,
		        Constants.GETSTATIC));
		// Stack: objectref -> objectref, value
		compileArrayGet(ctx);
		// Stack: objecref, value -> objectref, (char)value 
		ctx.append(new I2C());
		// Stack: objectref, value ->
		ctx.append(ctx.getFactory().createInvoke("java.io.PrintStream", 
				"print", 
				Type.VOID, 
				new Type[]{Type.CHAR}, 
				Constants.INVOKEVIRTUAL));
	}

	@Override
	public int getMaxStack() {
		return 2;
	}

}
