import static org.junit.Assert.*;

import org.junit.Test;


public class TrimmingTest {
	Trimming trm = new Trimming();
	
	@Test
	public void test() {
		assertEquals("lastOutput method should return empty String ", "", trm.lastOutput(""));
	}

}
