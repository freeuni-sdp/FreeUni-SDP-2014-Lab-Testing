package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Queue;

public class QueueTest {
	
	private Queue q;

	@Before
	public void setUp() throws Exception {
		q = new Queue();
	}
	
	@After
	public void tearDown() throws Exception {
		q = null;
	}
	
	@Test
	public void sizeShouldBeZeroWhenQueueIsEmpty() throws Exception {
		assertEquals(0, q.size());
	}
	
	@Test
	public void sizeShouldBeOneWhenAnItemIsEnqueued() throws Exception {
		q.enqueue(1);
		assertEquals(1, q.size());
	}
}