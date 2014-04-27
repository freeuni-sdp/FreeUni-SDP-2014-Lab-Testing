import static org.junit.Assert.*;

import org.junit.Test;


public class TrimmingTest {
	Trimming trm = new Trimming();
	
	@Test
	public void testSpaceCases() {
		assertEquals("lastOutput method should return empty String ", "", trm.lastOutput(""));
		assertEquals("lastOutput method should remove the space at the end ", "tako", trm.lastOutput("tako "));
		assertEquals("lastOutput method should remove all spaces at the end ", "tako", trm.lastOutput("tako    "));
		assertEquals("lastOutput method should not remove the space in the word ", " tako japaridze", trm.lastOutput(" tako japaridze"));
	}
	
	@Test
	public void testTabsAndEnterCases() {
		assertEquals("lastOutput method should remove the tabs at the and of the string ", "tako", trm.lastOutput("tako\t"));
		assertEquals("lastOutput method should remove the Enter at the end of the string ", "tako", trm.lastOutput("tako\n"));
	}

}
