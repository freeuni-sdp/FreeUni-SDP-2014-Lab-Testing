package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import IntegerStack.IntegerStack;

public class IntegerStackTest {

	private IntegerStack stack;
	
	@Before
	public void setup(){
		stack = new IntegerStack();
	}
	
	@Test
	public void testIntegerStackPop() {
		assertNull("pop should return null, because stack is empty", stack.pop());
		stack.push(0);
		assertEquals("pop should return 0, because 0 element has been pushed in stack", new Integer(0), stack.pop());
		assertNull("pop should return null, because all elements has been poped for stack", stack.pop());
	}
	
	@Test
	public void testIntegerStackPush() {
		Integer item = new Integer(0);
		stack.push(item);
		assertEquals("count should return 1, only one element has been pushed in stack", 1, stack.count());
		assertEquals("pop should return item, item has been pushed at leas in stack", item, stack.pop());
		stack.push(0);
		assertEquals(1, stack.count());
		stack.push(1);
		assertEquals(2, stack.count());
		assertEquals("pop should return 1, because 1 has been pushed as last element in stack", new Integer(1), stack.pop());
		assertEquals(1, stack.count());
		assertEquals("pop should return 0, because 0 has been pushed before last element in stack", new Integer(0), stack.pop());
		assertEquals(0, stack.count());
	}
	
	@Test
	public void testStackCount() {
		assertEquals("count should return 0, stack is empty", 0, stack.count());
		stack.push(0);
		assertEquals("stack count should be 1, one element has been pushed in stack", 1, stack.count());
		stack.pop();
		assertEquals("stack count should be 0, element has been poped from stack", 0, stack.count());
		stack.pop();
		assertEquals("stack count should be 0, element has been poped from empty stack", 0, stack.count());
	}
}
