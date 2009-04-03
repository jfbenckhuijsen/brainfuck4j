/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getHeap <em>Heap</em>}</li>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getProgramHeader()
 * @model
 * @generated
 */
public interface ProgramHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Heap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap</em>' attribute.
	 * @see #setHeap(int)
	 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getProgramHeader_Heap()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getHeap();

	/**
	 * Sets the value of the '{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getHeap <em>Heap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap</em>' attribute.
	 * @see #getHeap()
	 * @generated
	 */
	void setHeap(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getProgramHeader_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ProgramHeader
