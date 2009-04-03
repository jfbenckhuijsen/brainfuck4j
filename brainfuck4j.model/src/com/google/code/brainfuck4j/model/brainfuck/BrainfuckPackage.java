/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.code.brainfuck4j.model.brainfuck;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.google.code.brainfuck4j.model.brainfuck.BrainfuckFactory
 * @model kind="package"
 * @generated
 */
public interface BrainfuckPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "brainfuck";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://code.google.com/p/brainfuck4j/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "brainfuck";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrainfuckPackage eINSTANCE = com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.ProgramImpl
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.ProgramHeaderImpl <em>Program Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.ProgramHeaderImpl
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getProgramHeader()
	 * @generated
	 */
	int PROGRAM_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Heap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_HEADER__HEAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_HEADER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Program Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_HEADER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.ExpressionImpl
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.UnaryExpressionImpl
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__INSTRUCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BlockExpressionImpl
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getBlockExpression()
	 * @generated
	 */
	int BLOCK_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.code.brainfuck4j.model.brainfuck.Instruction <em>Instruction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.code.brainfuck4j.model.brainfuck.Instruction
	 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 5;


	/**
	 * Returns the meta object for class '{@link com.google.code.brainfuck4j.model.brainfuck.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.code.brainfuck4j.model.brainfuck.Program#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Program#getHeader()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.code.brainfuck4j.model.brainfuck.Program#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Program#getExpressions()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Expressions();

	/**
	 * Returns the meta object for class '{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader <em>Program Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Header</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.ProgramHeader
	 * @generated
	 */
	EClass getProgramHeader();

	/**
	 * Returns the meta object for the attribute '{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getHeap <em>Heap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heap</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getHeap()
	 * @see #getProgramHeader()
	 * @generated
	 */
	EAttribute getProgramHeader_Heap();

	/**
	 * Returns the meta object for the attribute '{@link com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.ProgramHeader#getName()
	 * @see #getProgramHeader()
	 * @generated
	 */
	EAttribute getProgramHeader_Name();

	/**
	 * Returns the meta object for class '{@link com.google.code.brainfuck4j.model.brainfuck.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link com.google.code.brainfuck4j.model.brainfuck.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.google.code.brainfuck4j.model.brainfuck.UnaryExpression#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.UnaryExpression#getInstruction()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Instruction();

	/**
	 * Returns the meta object for class '{@link com.google.code.brainfuck4j.model.brainfuck.BlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Expression</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.BlockExpression
	 * @generated
	 */
	EClass getBlockExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.code.brainfuck4j.model.brainfuck.BlockExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.BlockExpression#getExpressions()
	 * @see #getBlockExpression()
	 * @generated
	 */
	EReference getBlockExpression_Expressions();

	/**
	 * Returns the meta object for enum '{@link com.google.code.brainfuck4j.model.brainfuck.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instruction</em>'.
	 * @see com.google.code.brainfuck4j.model.brainfuck.Instruction
	 * @generated
	 */
	EEnum getInstruction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BrainfuckFactory getBrainfuckFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.ProgramImpl
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__HEADER = eINSTANCE.getProgram_Header();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__EXPRESSIONS = eINSTANCE.getProgram_Expressions();

		/**
		 * The meta object literal for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.ProgramHeaderImpl <em>Program Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.ProgramHeaderImpl
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getProgramHeader()
		 * @generated
		 */
		EClass PROGRAM_HEADER = eINSTANCE.getProgramHeader();

		/**
		 * The meta object literal for the '<em><b>Heap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_HEADER__HEAP = eINSTANCE.getProgramHeader_Heap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_HEADER__NAME = eINSTANCE.getProgramHeader_Name();

		/**
		 * The meta object literal for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.ExpressionImpl
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.UnaryExpressionImpl
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__INSTRUCTION = eINSTANCE.getUnaryExpression_Instruction();

		/**
		 * The meta object literal for the '{@link com.google.code.brainfuck4j.model.brainfuck.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BlockExpressionImpl
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getBlockExpression()
		 * @generated
		 */
		EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_EXPRESSION__EXPRESSIONS = eINSTANCE.getBlockExpression_Expressions();

		/**
		 * The meta object literal for the '{@link com.google.code.brainfuck4j.model.brainfuck.Instruction <em>Instruction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.code.brainfuck4j.model.brainfuck.Instruction
		 * @see com.google.code.brainfuck4j.model.brainfuck.impl.BrainfuckPackageImpl#getInstruction()
		 * @generated
		 */
		EEnum INSTRUCTION = eINSTANCE.getInstruction();

	}

} //BrainfuckPackage
