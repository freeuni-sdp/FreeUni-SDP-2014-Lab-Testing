package test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Rectangle;

public class RectangleTest {

	@Test
	public void test() {
		Rectangle r = new Rectangle(0, 0, 5, 5);
		assertTrue(r.getArea() == 25);
	}

}
