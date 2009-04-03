package com.googlecode.brainfuck4j;

public class ProgramHeader extends SimpleNode {
	private String name;

	public ProgramHeader(int id) {
		super(id);
	}

	public ProgramHeader(Brainfuck p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(BrainfuckVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + ":" + this.name;
	}

}
