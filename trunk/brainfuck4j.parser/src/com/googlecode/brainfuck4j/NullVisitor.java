/**
 * 
 */
package com.googlecode.brainfuck4j;

/**
 * @author a108600
 *
 */
public class NullVisitor implements BrainfuckVisitor {

	/**
	 * 
	 */
	public NullVisitor() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.SimpleNode, java.lang.Object)
	 */
	@Override
	public Object visit(SimpleNode node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.ASTStart, java.lang.Object)
	 */
	@Override
	public Object visit(ASTStart node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.Header, java.lang.Object)
	 */
	@Override
	public Object visit(Header node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.ProgramHeader, java.lang.Object)
	 */
	@Override
	public Object visit(ProgramHeader node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.HeapHeader, java.lang.Object)
	 */
	@Override
	public Object visit(HeapHeader node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.Expression, java.lang.Object)
	 */
	@Override
	public Object visit(Expression node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.UnaryExpression, java.lang.Object)
	 */
	@Override
	public Object visit(UnaryExpression node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.googlecode.brainfuck4j.BrainfuckVisitor#visit(com.googlecode.brainfuck4j.BlockExpression, java.lang.Object)
	 */
	@Override
	public Object visit(BlockExpression node, Object data) {
		node.childrenAccept(this, data);
		return data;
	}

}
