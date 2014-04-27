import static org.junit.Assert.*;

import org.junit.Test;


public class TrimmingTest {
	Trimming trm = new Trimming();
	
	@Test
	public void test() {
		assertEquals("lastOutput method should return empty String ", "", trm.lastOutput(""));
		assertEquals("lastOutput method should remove the space at the end ", "tako", trm.lastOutput("tako "));
		
	}

}
