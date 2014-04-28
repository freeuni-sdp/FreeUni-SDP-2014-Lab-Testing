import static org.junit.Assert.*;

import org.junit.Test;

/**
 * tests class IntegerRange
 * 
 * @author saba
 * 
 */
public class IntegerRangeTester {

	@Test
	public void inRangeTest() throws UncorrectRangeException {
		IntegerRange range = new IntegerRange(0, 5);
		assertTrue(range.isInRange(3));
		assertTrue(range.isInRange(4));
		assertTrue(range.isInRange(1));
		assertFalse(range.isInRange(10));
		assertFalse(range.isInRange(-3));
	}

	@Test
	public void criticalPointsInRangeTest() throws UncorrectRangeException {
		IntegerRange range = new IntegerRange(-1, 7);
		assertTrue(range.isInRange(-1));
		assertTrue(range.isInRange(6));
		assertFalse(range.isInRange(7));
		assertFalse(range.isInRange(-2));
	}

	@Test(expected = UncorrectRangeException.class)
	public void uncorrectRangeTest1() throws UncorrectRangeException {
		IntegerRange range2 = new IntegerRange(1, 1);
	}

	@Test(expected = UncorrectRangeException.class)
	public void uncorrectRangeTest2() throws UncorrectRangeException {
		IntegerRange range1 = new IntegerRange(2, 1);
	}

	@Test
	public void intersectWhenOneRangeContainsAnotherTest()
			throws UncorrectRangeException {
		IntegerRange range1 = new IntegerRange(2, 7);
		IntegerRange range2 = new IntegerRange(3, 6);
		IntegerRange range3 = new IntegerRange(2, 5);
		IntegerRange range4 = new IntegerRange(4, 7);
		IntegerRange res1 = range1.intersectWithRange(range2);
		IntegerRange res2 = range1.intersectWithRange(range3);
		IntegerRange res3 = range1.intersectWithRange(range4);
		assertEquals(res1.getBegining(), 3);
		assertEquals(res1.getEnd(), 6);
		assertEquals(res2.getBegining(), 2);
		assertEquals(res2.getEnd(), 5);
		assertEquals(res3.getBegining(), 4);
		assertEquals(res3.getEnd(), 7);

	}

	@Test
	public void intersectingRangesTest() throws UncorrectRangeException {
		IntegerRange range1 = new IntegerRange(2, 7);
		IntegerRange range2 = new IntegerRange(6, 9);
		IntegerRange range3 = new IntegerRange(0, 4);
		IntegerRange res1 = range1.intersectWithRange(range2);
		IntegerRange res2 = range1.intersectWithRange(range3);
		assertEquals(res1.getBegining(), 6);
		assertEquals(res1.getEnd(), 7);
		assertEquals(res2.getBegining(), 2);
		assertEquals(res2.getEnd(), 4);

	}

	@Test(expected = UncorrectRangeException.class)
	public void unIntersectingRangesIntersectTest1()
			throws UncorrectRangeException {
		IntegerRange range1 = new IntegerRange(2, 7);
		IntegerRange range2 = new IntegerRange(7, 9);
		range1.intersectWithRange(range2);
	}

	@Test(expected = UncorrectRangeException.class)
	public void unIntersectingRangesIntersectTest2()
			throws UncorrectRangeException {
		IntegerRange range1 = new IntegerRange(2, 7);
		IntegerRange range2 = new IntegerRange(0, 2);
		range1.intersectWithRange(range2);
	}

	@Test(expected = UncorrectRangeException.class)
	public void unIntersectingRangesIntersectTest3()
			throws UncorrectRangeException {
		IntegerRange range1 = new IntegerRange(2, 7);
		IntegerRange range2 = new IntegerRange(7, 9);
		range1.intersectWithRange(range2);
	}

}
