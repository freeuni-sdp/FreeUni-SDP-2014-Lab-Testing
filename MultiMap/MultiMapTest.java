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
}
