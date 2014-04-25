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
		set.add("newString");
		assertEquals("count should return 0, because add method is not correct", 0, set.count());
		
	}

}
