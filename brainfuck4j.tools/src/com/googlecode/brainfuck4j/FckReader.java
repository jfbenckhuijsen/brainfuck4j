/**
 * 
 */
package com.googlecode.brainfuck4j;

import java.io.InputStream;

import org.eclipse.emf.ecore.EPackage;

import com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage;
import com.google.code.brainfuck4j.model.brainfuck.Program;

/**
 * @author jeroen
 *
 */
public class FckReader {
	private Program program;

	/**
	 * @throws ParseException 
	 * @throws RecognitionException 
	 * 
	 */
	public FckReader(InputStream is) throws ParseException {
		super();
		
		EPackage fckPackage = BrainfuckPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(fckPackage.getNsURI(), fckPackage);
		
//		ANTLRReaderStream input = new ANTLRReaderStream(reader);
//		brainfuckLexer lexer = new brainfuckLexer(input);
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		brainfuckParser parser = new brainfuckParser(tokens);
//		Node root = parser.parse();
//		if (!parser.getErrors().isEmpty()) {
//			StringBuilder errors = new StringBuilder();
//			for (ErrorMsg error : parser.getErrors()) {
//				errors.append(error.getMsg()).append("\n");
//			}
//			throw new ParseException(new SyntaxError(0,0,0, errors.toString()));
//		}
		
		ModelTransformVisitor visitor = new ModelTransformVisitor();
		Brainfuck.parse(is, visitor);
		
		this.program = visitor.getRoot();
	}

	/**
	 * @return the program
	 */
	public Program getProgram() {
		return program;
	}

}
