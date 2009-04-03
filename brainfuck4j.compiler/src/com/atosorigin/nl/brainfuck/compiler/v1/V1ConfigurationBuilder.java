package com.atosorigin.nl.brainfuck.compiler.v1;

import java.util.HashMap;
import java.util.Map;

import com.atosorigin.nl.brainfuck.compiler.base.CompilerConfiguration;
import com.atosorigin.nl.brainfuck.compiler.base.ConfigurationBuilder;
import com.atosorigin.nl.brainfuck.compiler.base.InstructionCompiler;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;

public class V1ConfigurationBuilder implements ConfigurationBuilder {

	@Override
	public CompilerConfiguration createConfiguration() {
		CompilerConfiguration config = new CompilerConfiguration();
		
		config.setMemberCompiler(new MemberCompiler());
		config.setConstructorCompiler(new ConstructorCompiler());
		config.setMainCompiler(new MainCompiler());
		config.setExecuteCompiler(new ExecuteCompiler());

		Map<Instruction, InstructionCompiler> compilers = new HashMap<Instruction, InstructionCompiler>();
		
		compilers.put(Instruction.DEC_POINTER, new PointerDecCompiler());
		compilers.put(Instruction.DEC_VALUE, new DecrementCompiler());
		compilers.put(Instruction.INC_POINTER, new PointerIncCompiler());
		compilers.put(Instruction.INC_VALUE, new IncrementCompiler());
		compilers.put(Instruction.INPUT, new InputCompiler());
		compilers.put(Instruction.OUTPUT, new OutputCompiler());
		
		config.setCompilers(compilers);
		
		return config;
	}

}
