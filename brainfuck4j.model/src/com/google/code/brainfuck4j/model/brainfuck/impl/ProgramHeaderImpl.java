/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck.impl;

import com.google.code.brainfuck4j.model.brainfuck.BrainfuckPackage;
import com.google.code.brainfuck4j.model.brainfuck.ProgramHeader;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.impl.ProgramHeaderImpl#getHeap <em>Heap</em>}</li>
 *   <li>{@link com.google.code.brainfuck4j.model.brainfuck.impl.ProgramHeaderImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramHeaderImpl extends EObjectImpl implements ProgramHeader {
	/**
	 * The default value of the '{@link #getHeap() <em>Heap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeap()
	 * @generated
	 * @ordered
	 */
	protected static final int HEAP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeap() <em>Heap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeap()
	 * @generated
	 * @ordered
	 */
	protected int heap = HEAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrainfuckPackage.Literals.PROGRAM_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeap() {
		return heap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeap(int newHeap) {
		int oldHeap = heap;
		heap = newHeap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrainfuckPackage.PROGRAM_HEADER__HEAP, oldHeap, heap));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrainfuckPackage.PROGRAM_HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BrainfuckPackage.PROGRAM_HEADER__HEAP:
				return new Integer(getHeap());
			case BrainfuckPackage.PROGRAM_HEADER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BrainfuckPackage.PROGRAM_HEADER__HEAP:
				setHeap(((Integer)newValue).intValue());
				return;
			case BrainfuckPackage.PROGRAM_HEADER__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BrainfuckPackage.PROGRAM_HEADER__HEAP:
				setHeap(HEAP_EDEFAULT);
				return;
			case BrainfuckPackage.PROGRAM_HEADER__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BrainfuckPackage.PROGRAM_HEADER__HEAP:
				return heap != HEAP_EDEFAULT;
			case BrainfuckPackage.PROGRAM_HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (heap: ");
		result.append(heap);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProgramHeaderImpl
