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
		Rectangle b = new Rectangle(new Point(5, 5), new Point(20, 22));
		assertTrue(OverlappingRectangles.Check(a, b));
	}

}
