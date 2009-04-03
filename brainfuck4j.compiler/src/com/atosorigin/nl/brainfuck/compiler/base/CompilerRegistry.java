/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.base;

import java.util.HashMap;
import java.util.Map;

import com.atosorigin.nl.brainfuck.compiler.CompilerType;
import com.atosorigin.nl.brainfuck.compiler.curses.CursesConfigurationBuilder;
import com.atosorigin.nl.brainfuck.compiler.jline.JlineConfigurationBuilder;
import com.atosorigin.nl.brainfuck.compiler.v1.V1ConfigurationBuilder;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author jeroen
 *
 */
public class CompilerRegistry {

	private static CompilerConfiguration config;
	private static Map<CompilerType, ConfigurationBuilder> builders = new HashMap<CompilerType, ConfigurationBuilder>();
	
	static {
		builders.put(CompilerType.V1_COMPILER, new V1ConfigurationBuilder());
		builders.put(CompilerType.CURSES_COMPILER, new CursesConfigurationBuilder());
		builders.put(CompilerType.JLINE_COMPILER, new JlineConfigurationBuilder());
	}
	
	/**
	 * 
	 */
	protected CompilerRegistry() {
		super();
	}
	
	/**
	 * @param type
	 */
	public static void configure (CompilerType type) {
		ConfigurationBuilder builder = builders.get(type);
		config = builder.createConfiguration();
	}

	/**
	 * @return
	 */
	public static CompilerConfiguration getConfiguration() {
		return config;
	}

	/**
	 * @param instr
	 * @return
	 */
	public static InstructionCompiler getCompiler (Instruction instr) {
		return getConfiguration().getCompilers().get(instr);
	}
	
}
