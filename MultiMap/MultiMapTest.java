import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class MultiMapTest {
	
	@Test
	public void testInitialSizeValue(){
		MultiMap<String, List<Integer>> mp = new MultiMap<String, List<Integer>>();
		assertEquals(0, mp.size());
	}
	
	@Test
	public void testWhatIPutIsWhatIGet(){
		MultiMap<Integer, List<String>> mp = new MultiMap<Integer, List<String>>();
		mp.put(1, new ArrayList<String>());
		assertEquals(new Integer(1), mp.get().get(0));
	}
	
	@Test
	public void testSizeForNotEmptyMap(){
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		for(int i = 0; i < 5; i++){
			mp.put(i, new ArrayList<Integer>());
		}
		assertEquals(5, mp.size());
	}
	
	@Test
	public void testThatEmptyMapIsEmpty(){
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		assertTrue(mp.isEmpty());
	}
	
	@Test
	public void testThatNotEmptyMapIsNotEmpty(){
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		mp.put(1, new LinkedList<Integer>());
		assertFalse(mp.isEmpty());
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullKeyCausesException(){
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		mp.put(null, new LinkedList<Integer>());
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullValueCausesException(){
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		mp.put(1,null);
	}
	@Test
	public void testWhatIPutIsWhatIGetForBigNumbers(){
		Set<Integer> s1 = new HashSet<Integer>();
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		for(int i = 0; i < 1000; i++){
			mp.put(i, new ArrayList<Integer>());
			s1.add(i);
		}
		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(mp.get());
		assertTrue(s1.equals(s2));
	}
}
