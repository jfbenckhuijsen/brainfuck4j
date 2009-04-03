/**
 * 
 */
package com.atosorigin.nl.brainfuck.compiler.jline;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerConfiguration;
import com.atosorigin.nl.brainfuck.compiler.v1.V1ConfigurationBuilder;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

/**
 * @author a108600
 *
 */
public class JlineConfigurationBuilder extends V1ConfigurationBuilder {

	/**
	 * 
	 */
	public JlineConfigurationBuilder() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.brainfuck.compiler.v1.V1ConfigurationBuilder#createConfiguration()
	 */
	@Override
	public CompilerConfiguration createConfiguration() {
		CompilerConfiguration config = super.createConfiguration();
		
		config.setMemberCompiler(new JlineMemberCompiler());
		config.setConstructorCompiler(new JlineConstructorCompiler());
		config.getCompilers().put(Instruction.INPUT, new JlineInputCompiler());
		
		return config;
	}

}
