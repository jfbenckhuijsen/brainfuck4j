/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.Program#getHeader <em>Header</em>}</li>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.Program#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(ProgramHeader)
	 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getProgram_Header()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ProgramHeader getHeader();

	/**
	 * Sets the value of the '{@link com.google.code.brainfuck4j.model.brainfuck.Program#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(ProgramHeader value);

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
	 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getProgram_Expressions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Program
