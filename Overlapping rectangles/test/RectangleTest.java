package test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Rectangle;

public class RectangleTest {

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(0, 0, 5, 5);
		assertTrue(r.getArea() == 25);
		r = new Rectangle(-1,-1, 2, 2);
		assertTrue(r.getArea() == 9);
		r = new Rectangle(2.3, 2.3, 2.3, 2.3);
		assertTrue(r.getArea() == 0);
	}
	
}
