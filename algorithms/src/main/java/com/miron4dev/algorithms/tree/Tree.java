package com.miron4dev.algorithms.tree;

public interface Tree<T> {

	void insert(T data);

	void delete(T data);

	T getMax();

	T getMin();

	int size();
}
