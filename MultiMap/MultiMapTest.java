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
		List<Integer> s1 = new ArrayList<Integer>();
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		for(int i = 0; i < 10; i++){
			mp.put(1, new ArrayList<Integer>());
			s1.add(1);
		}
		assertTrue(s1.equals(mp.get()));
	}
	
	@Test
	public void testTotalNumberOfValuesForEmptyMap(){
		MultiMap<String, List<Integer>> mp = new MultiMap<String, List<Integer>>();
		assertEquals(0, mp.valueCount());
	}
	
	@Test
	public void testTotalNumberOfValuesForNotEmptyMap(){
		MultiMap<Integer, List<Integer>> mp = new MultiMap<Integer, List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		mp.put(1, l);
		assertEquals(l.size(), mp.valueCount());
		mp.put(2, l);
		assertEquals(2*l.size(), mp.valueCount());
	}
	
	@Test
	public void testDuplicatedValuesAreNotAllowed(){
	}
}
