import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringSetTest {

	private StringSet set;
	
	@Before
	public void createSet() {
		set = new StringSet();
	}
	
	@Test
	public void addTest() {
		assertEquals("count should return 0, because there is no elemenet", 0, set.count());
		set.add("newString");
		assertEquals("count should return 1", 1, set.count());
		set.add("newString");
		assertEquals("count should return 1", 1, set.count());
	}
	
	@Test
	public void removeTest() {
		set.add("newString");
		assertTrue(set.remove("newString"));
		
	}
	
	@Test
	public void clearTest() {
		set.add("newString");
		set.add("second string");
		set.clear();
		assertEquals("count should return 0, because set is cleared", 0, set.count());
		
	}

}
