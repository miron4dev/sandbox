package com.miron4dev.algorithms.tree.bst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miron4dev.algorithms.tree.Tree;

public class BinarySearchTreeUnitTest {

	@Test
	public void insert() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);
		bst.insert(1);

		assertEquals(5, bst.size());
	}

	@Test
	public void getMin() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);
		bst.insert(1);

		assertEquals(new Integer(1), bst.getMin());
	}

	@Test
	public void getMax() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);
		bst.insert(1);

		assertEquals(new Integer(14), bst.getMax());
	}

	@Test
	public void deleteLeaf() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);
		bst.insert(1);

		bst.delete(1);

		System.out.println(bst.toString());

		assertEquals(4, bst.size());
		assertEquals("4 -> 8 -> 10 -> 14 -> ", bst.toString());
	}

	@Test
	public void deleteWithLeftChild() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(14);
		bst.insert(1);

		bst.delete(4);

		System.out.println(bst.toString());

		assertEquals(3, bst.size());
		assertEquals("1 -> 10 -> 14 -> ", bst.toString());
	}

	@Test
	public void deleteWithRightChild() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);

		bst.delete(8);

		System.out.println(bst.toString());

		assertEquals(3, bst.size());
		assertEquals("4 -> 10 -> 14 -> ", bst.toString());
	}


	@Test
	public void deleteRoot() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);
		bst.insert(1);

		bst.delete(10);

		System.out.println(bst.toString());

		assertEquals(4, bst.size());
		assertEquals("1 -> 4 -> 8 -> 14 -> ", bst.toString());
	}

	@Test
	public void testToString() {
		Tree<Integer> bst = new BinarySearchTree<>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(8);
		bst.insert(14);
		bst.insert(1);

		assertEquals("1 -> 4 -> 8 -> 10 -> 14 -> ", bst.toString());
	}

}