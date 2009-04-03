package com.atosorigin.nl.brainfuck.compiler.base;

import java.util.Map;

import com.google.code.brainfuck4j.model.brainfuck.Instruction;

public class CompilerConfiguration {
	
	private InstructionCompiler memberCompiler; 
	private InstructionCompiler constructorCompiler;
	private InstructionCompiler mainCompiler;
	private InstructionCompiler executeCompiler;
	private Map<Instruction, InstructionCompiler> compilers;
	
	public CompilerConfiguration() {
		super();
	}

	/**
	 * @return the memberCompiler
	 */
	public InstructionCompiler getMemberCompiler() {
		return memberCompiler;
	}

	/**
	 * @param memberCompiler the memberCompiler to set
	 */
	public void setMemberCompiler(InstructionCompiler memberCompiler) {
		this.memberCompiler = memberCompiler;
	}

	/**
	 * @return the constructorCompiler
	 */
	public InstructionCompiler getConstructorCompiler() {
		return constructorCompiler;
	}

	/**
	 * @param constructorCompiler the constructorCompiler to set
	 */
	public void setConstructorCompiler(InstructionCompiler constructorCompiler) {
		this.constructorCompiler = constructorCompiler;
	}

	/**
	 * @return the mainCompiler
	 */
	public InstructionCompiler getMainCompiler() {
		return mainCompiler;
	}

	/**
	 * @param mainCompiler the mainCompiler to set
	 */
	public void setMainCompiler(InstructionCompiler mainCompiler) {
		this.mainCompiler = mainCompiler;
	}

	/**
	 * @return the executeCompiler
	 */
	public InstructionCompiler getExecuteCompiler() {
		return executeCompiler;
	}

	/**
	 * @param executeCompiler the executeCompiler to set
	 */
	public void setExecuteCompiler(InstructionCompiler executeCompiler) {
		this.executeCompiler = executeCompiler;
	}

	/**
	 * @return the compilers
	 */
	public Map<Instruction, InstructionCompiler> getCompilers() {
		return compilers;
	}

	/**
	 * @param compilers the compilers to set
	 */
	public void setCompilers(Map<Instruction, InstructionCompiler> compilers) {
		this.compilers = compilers;
	}

	
}
