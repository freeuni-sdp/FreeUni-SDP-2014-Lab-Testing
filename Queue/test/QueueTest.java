package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Queue;

public class QueueTest {

	@Test
	public void testEnqueue() {
		Queue<Integer> q = new Queue<Integer>();
		assertNotNull(q);
	}
}