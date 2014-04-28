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
	}

	@Test
	public void criticalPointsinRangeTest() throws UncorrectRangeException {
		IntegerRange range = new IntegerRange(-1, 7);
		assertTrue(range.isInRange(-1));
		assertTrue(range.isInRange(6));
		assertFalse(range.isInRange(7));
	}

	@Test(expected = UncorrectRangeException.class)
	public void testForNonExistingNumbers() throws UncorrectRangeException {
		IntegerRange range = new IntegerRange(2, 1);
		IntegerRange range2 = new IntegerRange(1, 1);
	}

}
