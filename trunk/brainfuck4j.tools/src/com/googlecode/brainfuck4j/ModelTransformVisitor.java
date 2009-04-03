/**
 * 
 */
package com.googlecode.brainfuck4j;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.code.brainfuck4j.model.brainfuck.BrainfuckFactory;
import com.google.code.brainfuck4j.model.brainfuck.Instruction;
import com.google.code.brainfuck4j.model.brainfuck.Program;

/**
 * @author a108600
 * 
 */
public class ModelTransformVisitor implements BrainfuckVisitor {
	private static BrainfuckFactory factory = BrainfuckFactory.eINSTANCE;
	private static Map<String, Instruction> instructionMap = new HashMap<String, Instruction>();

	private Map<Node, EObject> nodes = new HashMap<Node, EObject>();
	private Program root;
	
	static {
		instructionMap.put("+", Instruction.INC_VALUE);
		instructionMap.put("-", Instruction.DEC_VALUE);
		instructionMap.put(">", Instruction.INC_POINTER);
		instructionMap.put("<", Instruction.DEC_POINTER);
		instructionMap.put(".", Instruction.OUTPUT);
		instructionMap.put(",", Instruction.INPUT);
	}

	/**
	 * 
	 */
	public ModelTransformVisitor() {
		super();
	}

	/**
	 * @return the root
	 */
	public Program getRoot() {
		return root;
	}

	@Override
	public Object visit(SimpleNode node, Object data) {
		throw new IllegalArgumentException(
				"Invalid node type encountered. Is there no subclass accessor?:"
						+ node.getClass().getCanonicalName());
	}

	@Override
	public Object visit(ASTStart node, Object data) {
		Program program = factory.createProgram();

		nodes.put(node, program);
		this.root = program;
		
		data = node.childrenAccept(this, data);

		return data;
	}

	@Override
	public Object visit(Header node, Object data) {
		com.google.code.brainfuck4j.model.brainfuck.ProgramHeader header = factory
				.createProgramHeader();

		Program program = getParent(node, Program.class);
		program.setHeader(header);

		nodes.put(node, header);
		
		data = node.childrenAccept(this, data);

		return data;
	}

	@Override
	public Object visit(ProgramHeader node, Object data) {

		com.google.code.brainfuck4j.model.brainfuck.ProgramHeader header = getParent(
				node,
				com.google.code.brainfuck4j.model.brainfuck.ProgramHeader.class);

		header.setName(node.getName());
		
		data = node.childrenAccept(this, data);

		return data;
	}

	@Override
	public Object visit(HeapHeader node, Object data) {

		com.google.code.brainfuck4j.model.brainfuck.ProgramHeader header = getParent(
				node,
				com.google.code.brainfuck4j.model.brainfuck.ProgramHeader.class);

		header.setHeap(Integer.parseInt(node.getSize()));
		
		data = node.childrenAccept(this, data);

		return data;
	}

	@Override
	public Object visit(Expression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(UnaryExpression node, Object data) {
		com.google.code.brainfuck4j.model.brainfuck.UnaryExpression expr = factory
				.createUnaryExpression();

		String instrStr = node.getInstruction();
		Instruction instr = instructionMap.get(instrStr);
		if (instr == null) {
			throw new IllegalArgumentException("Unknown instruction type encountered:" + instrStr);
		}

		expr.setInstruction(instr);
		addToParentExpressionList(node, expr);
		
		data = node.childrenAccept(this, data);

		return data;
	}

	@Override
	public Object visit(BlockExpression node, Object data) {
		com.google.code.brainfuck4j.model.brainfuck.BlockExpression expr = factory
				.createBlockExpression();

		addToParentExpressionList(node, expr);

		nodes.put(node, expr);
		
		data = node.childrenAccept(this, data);

		return data;
	}

	private void addToParentExpressionList(Node node,
			com.google.code.brainfuck4j.model.brainfuck.Expression expr) {
		EObject parent = getParent(node.jjtGetParent(), EObject.class);
		EList<com.google.code.brainfuck4j.model.brainfuck.Expression> exprList;
		if (parent instanceof Program) {
			Program program = (Program) parent;
			exprList = program.getExpressions();
		} else if (parent instanceof com.google.code.brainfuck4j.model.brainfuck.BlockExpression) {
			com.google.code.brainfuck4j.model.brainfuck.BlockExpression block = (com.google.code.brainfuck4j.model.brainfuck.BlockExpression) parent;
			exprList = block.getExpressions();
		} else {
			throw new IllegalArgumentException(
					"Invalid parent type encountered for a expression node:"
							+ parent.getClass().getCanonicalName());
		}
		exprList.add(expr);
	}

	private <T extends EObject> T getParent(Node node, Class<T> type) {
		EObject parent = nodes.get(node.jjtGetParent());
		if (parent == null) {
			throw new IllegalArgumentException("The parent could not be found");
		}
		
		if (!type.isInstance(parent)) {
			throw new IllegalArgumentException("The parent "
					+ parent.getClass().getCanonicalName()
					+ "is not of the expected type:" + type.getCanonicalName());
		}
		return (T) parent;
	}
}
