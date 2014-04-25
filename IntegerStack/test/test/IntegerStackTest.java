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
	}
	
	
	@Test
	public void testIntegerStackPush() {
		Integer item = new Integer(0);
		stack.push(item);
		assertEquals("count should return 1, only one element has been pushed in stack", 1, stack.count());
		assertEquals("pop should return item, item has been pushed at leas in stack", item, stack.pop());
	}
	
	@Test
	public void testStackCount() {
		assertEquals("count should return 0, stack is empty", 0, stack.count());
	}
}
