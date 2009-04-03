/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.BlockExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getBlockExpression()
 * @model
 * @generated
 */
public interface BlockExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.code.brainfuck4j.model.brainfuck.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getBlockExpression_Expressions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // BlockExpression
