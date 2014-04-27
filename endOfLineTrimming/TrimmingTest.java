import static org.junit.Assert.*;

import org.junit.Test;


public class TrimmingTest {
	Trimming trm = new Trimming();
	
	@Test
	public void test() {
		assertEquals("lastOutput method should return empty String ", "", trm.lastOutput(""));
		assertEquals("lastOutput method should remove the space at the end ", "tako", trm.lastOutput("tako "));
		assertEquals("lastOutput method should remove all spaces at the end ", "tako", trm.lastOutput("tako    "));
		assertEquals("lastOutput method should not remove the space in the word ", " tako japaridze", trm.lastOutput(" tako japaridze"));

	}

}
