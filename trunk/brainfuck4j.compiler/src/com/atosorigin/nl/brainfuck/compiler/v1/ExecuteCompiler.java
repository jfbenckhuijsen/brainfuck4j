/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.v1;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.RETURN;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.MethodCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Program;

/**
 * @author jeroen
 *
 */
public class ExecuteCompiler extends MethodCompiler {
	
	private int maxStack = 1;

	/**
	 * 
	 */
	public ExecuteCompiler() {
		super();
	}

	@Override
	protected MethodGen createMethod(CompilerContext ctx, Object instr,
			ConstantPoolGen cp, InstructionList il) {
		if (!(instr instanceof Program)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}
		Program program = (Program) instr;
		
		MethodGen execute = new MethodGen(Constants.ACC_PRIVATE,
				Type.VOID,
				Type.NO_ARGS,
				new String[0],
				"execute",
				ctx.getClassName(),
				il,
				cp);
		ctx.setIl(il);
		ctx.setMg(execute);
		
		execute.addException("java.io.IOException");
		
		// Stack: ->
		compilePointer(ctx);
		// Stack: ->
		maxStack = this.compileExpressionList(ctx, program.getExpressions());

		return execute;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.MethodCompiler#appendReturnStatement(com.atosorigin.nl.brainfuck.compiler.CompilerContext, java.lang.Object, org.apache.bcel.generic.ConstantPoolGen, org.apache.bcel.generic.InstructionList)
	 */
	@Override
	protected void appendReturnStatement(CompilerContext ctx, Object instr,
			ConstantPoolGen cp, InstructionList il) {
		// Stack: ->
		ctx.append(new RETURN());
	}

	/**
	 * @param ctx
	 */
	private void compilePointer (CompilerContext ctx) {
		LocalVariableGen ptr = ctx.getMg().addLocalVariable(
				"ptr", 
				Type.INT, 
				null, 
				null);
		int ptrIdx = ptr.getIndex();
		ctx.setPointerIdx(ptrIdx);
		
		// Stack: -> constant
		ctx.append(InstructionFactory.createNull(Type.INT));
		// Stack: constant ->
		ptr.setStart(ctx.append(new ISTORE(ptrIdx)));
	}

	@Override
	public int getMaxStack() {
		return maxStack;
	}

}
