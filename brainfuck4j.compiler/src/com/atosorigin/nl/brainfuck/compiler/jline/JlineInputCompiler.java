/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.jline;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.IF_ICMPNE;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.v1.InputCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author a108600
 *
 */
public class JlineInputCompiler extends InputCompiler {

	/**
	 * 
	 */
	public JlineInputCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.v1.InputCompiler#compile(com.atosorigin.nl.brainfuck.compiler.base.CompilerContext, java.lang.Object)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		if (!instr.equals(Instruction.INPUT)) {
			throw new IllegalArgumentException("Invalid instruction: " + instr.getClass().getCanonicalName());
		}

		ObjectType console = new ObjectType("jline.ConsoleReader");

		// Stack : -> this
		ctx.append(InstructionFactory.createThis());
		// Stack : this -> arrayref
		ctx.append(ctx.getFactory().createFieldAccess(ctx.getClassName(), 
				ctx.getHeap().getName(), 
				ctx.getHeapType(),
				Constants.GETFIELD));
		// Stack: arrayref -> arrayref, index
		ctx.append(InstructionFactory.createLoad(ctx.getPointerType(), ctx.getPointerIdx()));
		// Stack : arrayref, index -> arrayref, index, this
		ctx.append(InstructionFactory.createThis());
		// Stack : arrayref, index, this -> arrayref, index, objectref
		ctx.append(ctx.getFactory().createFieldAccess(ctx.getClassName(),
				"console", 
				console, 
				Constants.GETFIELD));
		// Stack: arrayref, index, objectref -> arrayref, index, value
		ctx.append(ctx.getFactory().createInvoke("jline.ConsoleReader", 
				"readVirtualKey", 
				Type.INT, 
				Type.NO_ARGS, 
				Constants.INVOKEVIRTUAL));
		
		// Echo type character -->
		
		ObjectType p_stream = new ObjectType("java.io.PrintStream");

		// Stack: arrayRef, index, value -> arrayRef, index, value, value
		ctx.append(InstructionFactory.createDup(1));
		// Stack : arrayRef, index, value, value -> arrayRef, index, value, value, objectref
		ctx.append(ctx.getFactory().createFieldAccess("java.lang.System", 
				"out", 
				p_stream,
		        Constants.GETSTATIC));
		// Stack : arrayRef, index, value, value, objectref -> arrayRef, index, value, objectref, value
		ctx.append(InstructionFactory.SWAP);
		// Stack : arrayRef, index, value, value, objectref -> arrayRef, index, value, objectref, (char)value
		ctx.append(new I2C());
		// Stack : arrayRef, index, value, value, objectref -> arrayRef, index, value
		ctx.append(ctx.getFactory().createInvoke("java.io.PrintStream", 
				"print", 
				Type.VOID, 
				new Type[]{Type.CHAR}, 
				Constants.INVOKEVIRTUAL));
		
		// <--
		
		// Stack: arrayref, index, value -> arrayref, index, value, value
		ctx.append(InstructionFactory.createDup(1));
		
		// Stack: arrayref, index, value, value -> arrayref, index, value, value, 13
		ctx.append(ctx.getFactory().createConstant(13));

		// Stack: arrayref, index, value, value, 10 -> arrayref, index, value
		BranchInstruction ifne = new IF_ICMPNE(null);
		ctx.append(ifne);
		
		// Stack: arrayref, index, value -> arrayref, index
		ctx.append(InstructionFactory.POP);
		
		// Stack: arrayref, index -> arrayref, index, 10
		ctx.append(ctx.getFactory().createConstant(10));

		
		// Stack: arrayref, index, value ->
		InstructionHandle hnd = ctx.append(InstructionFactory.createArrayStore(ctx.getPointerType()));	
		ifne.setTarget(hnd);
	}	

}
