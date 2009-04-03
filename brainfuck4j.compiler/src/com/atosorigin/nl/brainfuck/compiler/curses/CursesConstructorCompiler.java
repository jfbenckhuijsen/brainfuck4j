/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.curses;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.v1.ConstructorCompiler;

/**
 * @author a108600
 *
 */
public class CursesConstructorCompiler extends ConstructorCompiler {

	/**
	 * 
	 */
	public CursesConstructorCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.v1.ConstructorCompiler#createMethod(com.atosorigin.nl.brainfuck.compiler.CompilerContext, java.lang.Object, org.apache.bcel.generic.ConstantPoolGen, org.apache.bcel.generic.InstructionList)
	 */
	@Override
	protected MethodGen createMethod(CompilerContext ctx, Object instr,
			ConstantPoolGen cp, InstructionList il) {
		MethodGen method = super.createMethod(ctx, instr, cp, il);
		
		// Stack: -> 
		ctx.append(ctx.getFactory().createInvoke("jcurses.system.Toolkit", 
				"init", 
				Type.VOID, 
				Type.NO_ARGS, 
				Constants.INVOKESTATIC));
		
		return method;
	}

}
