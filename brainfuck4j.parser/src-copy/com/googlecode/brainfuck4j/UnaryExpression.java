package com.googlecode.brainfuck4j;

import com.googlecode.brainfuck4j.BrainfuckVisitor;

public class UnaryExpression extends SimpleNode {
	private String instruction;
	
	public UnaryExpression(int id) {
		super(id);
	}

	public UnaryExpression(Brainfuck p, int id) {
		super(p, id);
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
	public String getInstruction () {
		return this.instruction;
	}
	
	/** Accept the visitor. **/
	public Object jjtAccept(BrainfuckVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + ":" + this.instruction;
	}

}
