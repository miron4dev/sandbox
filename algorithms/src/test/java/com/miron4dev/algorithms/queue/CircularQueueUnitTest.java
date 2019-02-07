package com.miron4dev.algorithms.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CircularQueueUnitTest {

	@Test
	public void test() {
		CircularQueue circularQueue = new CircularQueue(8);

		assertTrue(circularQueue.enQueue(3));
		assertTrue(circularQueue.enQueue(9));
		assertTrue(circularQueue.enQueue(5));
		assertTrue(circularQueue.enQueue(0));

		assertTrue(circularQueue.deQueue());
		assertTrue(circularQueue.deQueue());

		assertFalse(circularQueue.isEmpty());
		assertFalse(circularQueue.isEmpty());

		assertEquals(9, circularQueue.Rear());
		assertEquals(9, circularQueue.Rear());

		assertTrue(circularQueue.deQueue());
	}

}