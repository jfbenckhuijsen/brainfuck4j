/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.base;

import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.RETURN;


/**
 * @author a108600
 *
 */
public abstract class MethodCompiler extends AbstractCompiler {

	/**
	 * 
	 */
	public MethodCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#compile(com.atosorigin.nl.brainfuck.compiler.CompilerContext, java.lang.Object)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		InstructionList il = new InstructionList();
		ConstantPoolGen cp = ctx.getConstantPool();		
		ctx.setIl(il);
		
		MethodGen method = createMethod(ctx, instr, cp, il);
		appendReturnStatement(ctx, instr, cp, il);
		
		method.setMaxStack();
		
		ctx.getCg().addMethod(method.getMethod());
		il.dispose();

	}
	
	/**
	 * @param ctx
	 * @param cp
	 * @param il
	 * @return
	 */
	protected abstract MethodGen createMethod(CompilerContext ctx, Object instr, ConstantPoolGen cp, InstructionList il);

	protected void appendReturnStatement (CompilerContext ctx, Object instr, ConstantPoolGen cp, InstructionList il) {
		// Stack: ->
		il.append(new RETURN());
	}
	
	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.InstructionCompiler#getMaxStack()
	 */
	@Override
	public int getMaxStack() {
		return 0;
	}

}
