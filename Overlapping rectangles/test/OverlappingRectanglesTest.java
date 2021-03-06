package test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.OverlappingRectangles;
import source.Point;
import source.Rectangle;

public class OverlappingRectanglesTest {

	@Test
	public void test() {
		Rectangle a = new Rectangle(new Point(0, 0), new Point(10, 10));
		Rectangle b = new Rectangle(new Point(-1, -1), new Point(0, 0));
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(-1, -1, 11.2, 11.2);
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(1.1, 1.5, 2.3, 2.3);
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(-1.1, 1.1, 11.2, 9.2);
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(10.1, 10.1, 20, 20);
		assertFalse(OverlappingRectangles.Check(a, b));
		b = new Rectangle(10, 10, 20, 20);
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(2, -1, 9, 11);
		assertTrue(OverlappingRectangles.Check(a, b));
		b = a;
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(0, 10, 10, 20);
		assertTrue(OverlappingRectangles.Check(a, b));
		b = new Rectangle(-1, -1, -0.00001, -0.000001);
		assertFalse(OverlappingRectangles.Check(a, b));
	}
	
}
