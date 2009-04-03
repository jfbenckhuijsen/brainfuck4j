/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instruction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage#getInstruction()
 * @model
 * @generated
 */
public enum Instruction implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(1, "NULL", "NULL"),

	/**
	 * The '<em><b>Inc Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INC_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	INC_POINTER(1, "IncPointer", "IncPointer"),

	/**
	 * The '<em><b>Dec Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	DEC_POINTER(2, "DecPointer", "DecPointer"),

	/**
	 * The '<em><b>Inc Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INC_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	INC_VALUE(3, "IncValue", "IncValue"),

	/**
	 * The '<em><b>Dec Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	DEC_VALUE(4, "DecValue", "DecValue"),

	/**
	 * The '<em><b>Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(5, "Output", "Output"),

	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(6, "Input", "Input");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 1;

	/**
	 * The '<em><b>Inc Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inc Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INC_POINTER
	 * @model name="IncPointer"
	 * @generated
	 * @ordered
	 */
	public static final int INC_POINTER_VALUE = 1;

	/**
	 * The '<em><b>Dec Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dec Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC_POINTER
	 * @model name="DecPointer"
	 * @generated
	 * @ordered
	 */
	public static final int DEC_POINTER_VALUE = 2;

	/**
	 * The '<em><b>Inc Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inc Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INC_VALUE
	 * @model name="IncValue"
	 * @generated
	 * @ordered
	 */
	public static final int INC_VALUE_VALUE = 3;

	/**
	 * The '<em><b>Dec Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dec Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC_VALUE
	 * @model name="DecValue"
	 * @generated
	 * @ordered
	 */
	public static final int DEC_VALUE_VALUE = 4;

	/**
	 * The '<em><b>Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT
	 * @model name="Output"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 5;

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="Input"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Instruction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Instruction[] VALUES_ARRAY =
		new Instruction[] {
			NULL,
			INC_POINTER,
			DEC_POINTER,
			INC_VALUE,
			DEC_VALUE,
			OUTPUT,
			INPUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Instruction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Instruction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instruction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instruction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instruction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instruction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instruction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instruction get(int value) {
		switch (value) {
			case NULL_VALUE: return NULL;
			case DEC_POINTER_VALUE: return DEC_POINTER;
			case INC_VALUE_VALUE: return INC_VALUE;
			case DEC_VALUE_VALUE: return DEC_VALUE;
			case OUTPUT_VALUE: return OUTPUT;
			case INPUT_VALUE: return INPUT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Instruction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Instruction
