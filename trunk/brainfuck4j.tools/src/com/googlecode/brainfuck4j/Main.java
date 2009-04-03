/**
 * 
 */
package com.googlecode.brainfuck4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author a108600
 *
 */
public class Main {
	
	private Compiler compiler = new Compiler();
	private XmiExporter exporter = new XmiExporter();

	private static final String COMPILE = "-compile";
	private static final String EXPORT = "-export";
	
	/**
	 * 
	 */
	public Main() {
		super();
	}

	/**
	 * @throws IOException 
	 * @param args
	 * @throws ParseException 
	 * @throws 
 
	 */
	public static void main(String[] args) throws ParseException, IOException {
		Main main = new Main();
		main.execute(args);
	}
	
	private void execute (String[] args) throws IOException, ParseException {
		if (args.length < 2) {
			usage();
		}
		
		String command = args[0];
		String inputFile = args[1];
		
		File pwd = new File(".").getAbsoluteFile();
		if (!pwd.canWrite()) {
			System.out.println("Cannot write to current directory");
		}
		
		File input = new File(inputFile);
		if (!input.exists() || !input.canRead()) {
			System.out.println("Cannot read from input file:" + inputFile);
			return;
		}
		InputStream is = new FileInputStream (input);
		
		if (COMPILE.equals(command)) {
			compiler.compile(is, pwd);
		} else if (EXPORT.equals(command)) {
			exporter.export(is, pwd);
		}
	}

	private void usage() {
		// TODO Auto-generated method stub
		
	}

}
