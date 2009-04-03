/**
 * 
 */
package com.googlecode.brainfuck4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.atosorigin.nl.brainfuck.compiler.CompilerType;
import com.atosorigin.nl.brainfuck.compiler.FckCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Program;

/**
 * @author a108600
 *
 */
public class Compiler {

	/**
	 * 
	 */
	public Compiler() {
		super();
	}

	public void compile (InputStream is, File dir) throws IOException, ParseException {
		FckReader reader = new FckReader(is);
		FckCompiler compiler = new FckCompiler(reader.getProgram());
		compiler.compile(createOutputStream(reader, dir));
	}

	public void compile (CompilerType type, InputStream is, File dir) throws IOException, ParseException {
		FckReader reader = new FckReader(is);
		FckCompiler compiler = new FckCompiler(reader.getProgram(), type);
		compiler.compile(createOutputStream(reader, dir));
	}
	
	private OutputStream createOutputStream (FckReader reader, File dir) throws FileNotFoundException {
		Program program = reader.getProgram();
		File output = new File(dir, program.getHeader().getName() + ".class");
		FileOutputStream os = new FileOutputStream(output);
		return os;
	}
	
}
