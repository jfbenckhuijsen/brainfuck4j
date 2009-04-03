/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.base;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.eclipse.emf.common.util.EList;

import com.atosorigin.nl.brainfuck.compiler.v1.LoopEndCompiler;
import com.atosorigin.nl.brainfuck.compiler.v1.LoopStartCompiler;
import com.google.code.brainfuck4j.model.brainfuck.BlockExpression;
import com.google.code.brainfuck4j.model.brainfuck.Expression;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;
import com.google.code.brainfuck4j.model.brainfuck.UnaryExpression;

/**
 * @author jeroen
 *
 */
public abstract class AbstractCompiler implements InstructionCompiler {
	private static LoopStartCompiler startCompiler = new LoopStartCompiler();
	private static LoopEndCompiler endCompiler = new LoopEndCompiler();

	/**
	 * 
	 */
	public AbstractCompiler() {
		super();
	}

	/**
	 * Compile instructions for getting the current value of heap[pointer]
	 * Stack: ... -> ..., value
	 * @param ctx
	 */
	protected InstructionHandle compileArrayGet(CompilerContext ctx) {
		// Stack: ... -> ..., this
		InstructionHandle first = ctx.append(InstructionFactory.createThis());
		// Stack: ..., this -> ..., arrayref
		ctx.append(ctx.getFactory().createFieldAccess(ctx.getClassName(), 
				ctx.getHeap().getName(),
				ctx.getHeapType(),
				Constants.GETFIELD));
		// Stack: ..., arrayref -> ..., arrayref, index
		ctx.append(InstructionFactory.createLoad(ctx.getPointerType(), ctx.getPointerIdx()));
		// Stack: ... arrayref, index -> ..., value
		ctx.append(InstructionFactory.createArrayLoad(ctx.getPointerType()));
		
		return first;
	}
	
	protected int compileExpressionList (CompilerContext ctx, EList<Expression> block) {
		int maxStack = 0;
		for (Expression expression : block) {
			int stackSize = compileExpression(ctx, expression);
			maxStack = Math.max(maxStack, stackSize);
		}
		return maxStack;
	}
	
	protected int compileExpression (CompilerContext ctx, Expression expression) {
		if (expression instanceof UnaryExpression) {
			UnaryExpression unary = (UnaryExpression) expression;
			return compileInstruction(ctx, unary.getInstruction());
		} else if (expression instanceof BlockExpression) {
			BlockExpression block = (BlockExpression) expression;
			
			startCompiler.compile(ctx, null);
			int stackSize = compileExpressionList(ctx, block.getExpressions());
			endCompiler.compile(ctx, null);
			
			return stackSize;
		} else {
			throw new IllegalStateException("Invalid expression type encountered:" + expression.getClass().getCanonicalName());
		}
	}
	
	protected int compileInstruction (CompilerContext ctx, Instruction instr) {
		InstructionCompiler compiler = CompilerRegistry.getCompiler(instr);
		compiler.compile(ctx, instr);
		return compiler.getMaxStack();
	}
}
