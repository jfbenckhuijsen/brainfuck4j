/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler;

import java.io.IOException;
import java.io.OutputStream;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerConfiguration;
import com.atosorigin.nl.brainfuck.compiler.base.CompilerContext;
import com.atosorigin.nl.brainfuck.compiler.base.CompilerRegistry;
import com.google.code.brainfuck4j.model.brainfuck.Program;


/**
 * @author jeroen
 *
 */
public class FckCompiler {

	private Program program;
	private CompilerContext ctx;
	
	/**
	 * 
	 */
	public FckCompiler(Program program) {
		this(program, CompilerType.V1_COMPILER);
	}
	
	/**
	 * @param program
	 * @param type
	 */
	public FckCompiler(Program program, CompilerType type) {
		super();
		CompilerRegistry.configure(type);
		this.program = program;
		this.ctx = new CompilerContext(program.getHeader().getName(), this.program.getHeader().getHeap());
	}
	
	public void compile(OutputStream stream) throws IOException {
		CompilerConfiguration config = CompilerRegistry.getConfiguration();
		
		config.getMemberCompiler().compile(ctx, null);
		config.getConstructorCompiler().compile(ctx, program);
		config.getMainCompiler().compile(ctx, null);
		config.getExecuteCompiler().compile(ctx,program);
		
		ctx.getCg().getJavaClass().dump(stream);
	}

}
