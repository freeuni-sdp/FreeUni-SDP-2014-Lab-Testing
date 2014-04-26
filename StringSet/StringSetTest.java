import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

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
	
	@Test
	public void countTest() {
		set.add("newString");
		assertEquals("count should return 1", 1, set.count());
		set.add("second string");
		assertEquals("count should return 2", 2, set.count());
		assertTrue(set.remove("newString"));
		assertEquals("count should return 1, because newString is deleted", 1, set.count());
		set.clear();
		assertEquals("count should return 0, because set is cleared", 0, set.count());
		
	}
	
	@Test
	public void containsTest() {
		set.add("newString");
		assertTrue(set.contains("newString"));
		assertFalse(set.contains("aa"));
		
	}
	
	@Test
	public void unionTest1() {
		Set<String> s = new HashSet<String>();
		s.add("a");
		set.add("newString");
		set.union(s);
		assertEquals("count should return 2", 2, set.count());
		
		
	}
	
	public void unionTest2() {
		Set<String> s = new HashSet<String>();
		s.add("a");
		s.add("newString");
		set.add("newString");
		set.union(s);
		assertEquals("count should return 2", 2, set.count());
		
	}
	public void unionTest3() {
		Set<String> s = new HashSet<String>();
		set.union(s);
		assertEquals("count should return 0", 0, set.count());
		
		set.add("aa");
		assertEquals("count should return 1", 1, set.count());
	}
	
	@Test
	public void intersectionTest1() {
		Set<String> s = new HashSet<String>();
		s.add("a");
		set.add("a");
		set.intersection(s);
		assertEquals("count should return 1", 1, set.count());
		
		
	}

}
