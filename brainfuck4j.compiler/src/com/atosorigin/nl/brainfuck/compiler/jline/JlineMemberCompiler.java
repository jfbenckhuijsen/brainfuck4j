/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.jline;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.ObjectType;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.v1.MemberCompiler;

/**
 * @author a108600
 *
 */
public class JlineMemberCompiler extends MemberCompiler {

	/**
	 * 
	 */
	public JlineMemberCompiler() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.v1.MemberCompiler#compile(com.atosorigin.nl.brainfuck.compiler.base.CompilerContext, java.lang.Object)
	 */
	@Override
	public void compile(CompilerContext ctx, Object instr) {
		super.compile(ctx, instr);
		ConstantPoolGen cp = ctx.getConstantPool();
		
		ObjectType console = new ObjectType("jline.ConsoleReader");
		
		FieldGen consoleGen = new FieldGen(
				Constants.ACC_PRIVATE, 
				console, 
				"console", 
				cp);
		ctx.getCg().addField(consoleGen.getField());
	}

}
