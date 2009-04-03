package com.atosorigin.nl.brainfuck.compiler.base;

import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.Constants;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;

/**
 * @author jeroen
 *
 */
public class CompilerContext {
	private ClassGen cg;
	private InstructionFactory factory;
	
	private Field heap;
	private ArrayType heapType;
	
	private InstructionList il;
	private MethodGen mg;
	
	private Type pointerType;
	private int pointerIdx;
	
	private List<InstructionHandle> branches = new ArrayList<InstructionHandle>();
	private List<BranchHandle> branchStarts = new ArrayList<BranchHandle>();
	private boolean storeNextForBranch = false;
	
	/**
	 * 
	 */
	public CompilerContext(String name, int heapSize) {
		super();
		this.cg = new ClassGen(name, "java.lang.Object", name + ".class", Constants.ACC_PUBLIC , null);
		this.factory = new InstructionFactory(this.cg);
		this.heapType = new ArrayType(Type.INT, 1);
		this.pointerType = Type.INT;
	}
	
	/**
	 * 
	 */
	public void storeNextForBranch(BranchHandle handle) {
		this.storeNextForBranch = true;
		branchStarts.add(handle);
	}
	
	/**
	 * @param handle
	 */
	public void setBranchTarget(InstructionHandle handle) {
		BranchHandle start = branchStarts.get(this.branchStarts.size() - 1);
		this.branchStarts.remove(start);
		start.setTarget(handle);
	}
	
	/**
	 * @return
	 */
	public InstructionHandle popBranch () {
		InstructionHandle result = this.branches.get(this.branches.size() - 1);
		this.branches.remove(result);
		return result;
	}
	
	/**
	 * @return the cg
	 */
	public ClassGen getCg() {
		return cg;
	}

	/**
	 * @param cg the cg to set
	 */
	public void setCg(ClassGen cg) {
		this.cg = cg;
	}

	/**
	 * @return the factory
	 */
	public InstructionFactory getFactory() {
		return factory;
	}

	/**
	 * @param factory the factory to set
	 */
	public void setFactory(InstructionFactory factory) {
		this.factory = factory;
	}

	/**
	 * @return the heap
	 */
	public Field getHeap() {
		return heap;
	}

	/**
	 * @param heap the heap to set
	 */
	public void setHeap(Field heap) {
		this.heap = heap;
	}

	/**
	 * @return the heapType
	 */
	public ArrayType getHeapType() {
		return heapType;
	}

	/**
	 * @param heapType the heapType to set
	 */
	public void setHeapType(ArrayType heapType) {
		this.heapType = heapType;
	}

	/**
	 * @param il the il to set
	 */
	public void setIl(InstructionList il) {
		this.il = il;
	}

	/**
	 * @return the mg
	 */
	public MethodGen getMg() {
		return mg;
	}

	/**
	 * @param mg the mg to set
	 */
	public void setMg(MethodGen mg) {
		this.mg = mg;
	}

	/**
	 * @return the pointerIdx
	 */
	public int getPointerIdx() {
		return pointerIdx;
	}

	/**
	 * @param pointerIdx the pointerIdx to set
	 */
	public void setPointerIdx(int pointerIdx) {
		this.pointerIdx = pointerIdx;
	}

	/**
	 * @return the pointerType
	 */
	public Type getPointerType() {
		return pointerType;
	}

	/**
	 * @return
	 * @see org.apache.bcel.generic.ClassGen#getClassName()
	 */
	public String getClassName() {
		return cg.getClassName();
	}

	/**
	 * @return
	 * @see org.apache.bcel.generic.ClassGen#getConstantPool()
	 */
	public ConstantPoolGen getConstantPool() {
		return cg.getConstantPool();
	}
	
	/**
	 * @param i
	 * @return
	 */
	public InstructionHandle append(Instruction i) {
		InstructionHandle handle = il.append(i);
		
		if (storeNextForBranch) {
			this.branches.add(handle);
		}
		storeNextForBranch = false;
		
		return handle;
	}

	/**
	 * @param i
	 * @return
	 * @see org.apache.bcel.generic.InstructionList#append(org.apache.bcel.generic.BranchInstruction)
	 */
	public BranchHandle append(BranchInstruction i) {
		BranchHandle handle = il.append(i);
		
		if (storeNextForBranch) {
			this.branches.add(handle);
		}
		storeNextForBranch = false;
		
		return handle;
	}

	/**
	 * @param c
	 * @return
	 */
	public InstructionHandle append(CompoundInstruction c) {
		InstructionHandle handle = il.append(c);
		
		if (storeNextForBranch) {
			this.branches.add(handle);
		}
		storeNextForBranch = false;
		
		return handle;
	}

}
