/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.UnaryExpression#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.google.code.brainfuck4j.model.brainfuck.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Instruction
	 * @see #setInstruction(Instruction)
	 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getUnaryExpression_Instruction()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link com.google.code.brainfuck4j.model.brainfuck.UnaryExpression#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Instruction
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

} // UnaryExpression
