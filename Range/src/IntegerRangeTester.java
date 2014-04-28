import static org.junit.Assert.*;

import org.junit.Test;

/**
 * tests class IntegerRange
 * @author saba
 *
 */
public class IntegerRangeTester {

	@Test
	public void inRangeTest() {
		IntegerRange range = new IntegerRange(0,5);
		assertTrue(range.isInRange(3));
	}

}
