package test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Point;
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
	@Test
	public void testPerimeter(){
		Rectangle r = new Rectangle(0, 0, 2.3, 2.3);
		assertTrue(r.getPerimeter() == 2.3 * 4);
		r = new Rectangle(new Point(-1.5, -1.5), new Point(1.5, 2.5));
		assertTrue(r.getPerimeter() == 14);
		r = new Rectangle(new Point(-10, -10), 20, 20);
		assertTrue(r.getPerimeter() == 80);
	}
	@Test
	public void testIsInside(){
		Point p = new Point(0, 0);
		Rectangle r = new Rectangle(-1, -1, 2, 3);
		assertTrue(r.isInside(p));
		p.setX(2.1);
		assertFalse(r.isInside(p));
		p = new Point(-1, -1);
		assertTrue(r.isInside(p));
	}
}
