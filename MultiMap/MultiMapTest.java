import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class MultiMapTest {
	
	@Test
	public void testInitialSizeValue(){
		MultiMap<String, List<Integer>> mp = new MultiMap<String, List<Integer>>();
		assertEquals(0, mp.size());
	}

}
