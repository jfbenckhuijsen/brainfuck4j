/**
 * 
 */
package com.googlecode.brainfuck4j;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author a108600
 *
 */
public class BrainfuckParserTest {

	private static final String HELLO_WORLD_HEADER = "Program HelloWorld\nHeapsize 1000\n Code\n";
	private static final String HELLO_WORLD = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParser () throws Exception {
		String program = HELLO_WORLD_HEADER + HELLO_WORLD;
		InputStream in = new ByteArrayInputStream(program.getBytes());
		Brainfuck.parse(in, new DumpVisitor());
	}
}
