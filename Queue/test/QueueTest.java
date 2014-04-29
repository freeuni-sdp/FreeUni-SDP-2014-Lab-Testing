package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.EmptyQueueException;
import src.Queue;

public class QueueTest {
	
	private Queue<Integer> q;

	@Before
	public void setUp() throws Exception {
		q = new Queue<Integer>();
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
	
	@Test
	public void sizeShouldBeDecreasedWhenAnItemIsDequeued() throws Exception {
		q.enqueue(1);
		q.dequeue();
		assertEquals(0, q.size());
	}
	
	@Test
	public void isEmptyShouldBeTrueWhenQueueSizeIsZero() throws Exception {
		assertTrue(q.isEmpty());
	}
	
	@Test
	public void isEmptyShouldBeFalseWhenQueueIsNotEmpty() throws Exception {
		q.enqueue(1);
		assertFalse(q.isEmpty());
	}
	
	@Test(expected=EmptyQueueException.class)
	public void dequeueShouldThrowEmptyQueueExceptionWhenQueueIsEmpty() throws Exception {
		q.dequeue();
	}
	
	@Test
	public void enqueuedItemShouldBeDequeued() throws Exception {
		Integer item = new Integer(1);
		q.enqueue(item);
		assertEquals(item, q.dequeue());
	}
	
	@Test
	public void threeEnqueuedItemsShouldBeDequeuedInFIFOOrder() throws Exception {
		Integer item1 = new Integer(1);
		Integer item2 = new Integer(2);
		Integer item3 = new Integer(3);
		q.enqueue(item1);
		q.enqueue(item2);
		q.enqueue(item3);
		assertEquals(item1, q.dequeue());
		assertEquals(item2, q.dequeue());
		assertEquals(item3, q.dequeue());
	}
}