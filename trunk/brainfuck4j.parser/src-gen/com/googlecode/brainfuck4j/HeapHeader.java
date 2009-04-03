package com.googlecode.brainfuck4j;

import com.googlecode.brainfuck4j.BrainfuckVisitor;

public class HeapHeader extends SimpleNode {
	private String size;

	public HeapHeader(int id) {
		super(id);
	}

	public HeapHeader(Brainfuck p, int id) {
		super(p, id);
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	/** Accept the visitor. **/
	public Object jjtAccept(BrainfuckVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + ":" + this.size;
	}

}
