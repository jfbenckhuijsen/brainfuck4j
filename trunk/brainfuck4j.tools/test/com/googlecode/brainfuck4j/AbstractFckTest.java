/**
 * 
 */
package com.googlecode.brainfuck4j;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author a108600
 *
 */
public abstract class AbstractFckTest {

	private static final String HELLO_WORLD_HEADER = "Program HelloWorld\nHeapsize 1000\n Code\n";
	private static final String HELLO_WORLD = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";

	/**
	 * 
	 */
	public AbstractFckTest() {
		super();
	}

	protected String getProgram () {
		String program = HELLO_WORLD_HEADER + HELLO_WORLD;
		return program;
	}
	
	protected InputStream getProgramStream() {
		return  new ByteArrayInputStream(getProgram().getBytes());
	}
}
