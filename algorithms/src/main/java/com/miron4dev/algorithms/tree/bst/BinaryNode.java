package com.miron4dev.algorithms.tree.bst;

public class BinaryNode<T> {

	private final T data;

	private BinaryNode<T> leftChild;
	private BinaryNode<T> rightChild;

	public BinaryNode(T data) {
		this.data = data;
	}

	public BinaryNode(T data, BinaryNode<T> leftChild, BinaryNode<T> rightChild) {
		this(data);
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public T getData() {
		return data;
	}

	public BinaryNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	public boolean isLeaf() {
		return leftChild == null && rightChild == null;
	}

	@Override
	public String toString() {
		return data.toString();
	}

}
