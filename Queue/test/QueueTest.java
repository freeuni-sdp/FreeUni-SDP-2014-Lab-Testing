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
}