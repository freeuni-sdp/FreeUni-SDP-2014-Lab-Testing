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
		
		assertEquals("lastOutput method should remove the space after ENTER ", "tako\njaparidze", trm.lastOutput("tako\n japaridze"));
		assertEquals("lastOutput method should remove the space after TAB ", "tako\tjaparidze", trm.lastOutput("tako\t  japaridze"));
		
		assertEquals("lastOutput method should remove the space after all enter  ", "tako\njaparidze\ntako", trm.lastOutput("tako\n japaridze\n tako"));
		assertEquals("lastOutput method should remove the space after all enter  ", "tako\n\njaparidze\ntako", trm.lastOutput("tako\n \n japaridze\n tako"));
		
		assertEquals("lastOutput method should remove the space after all enter  ", "tako\t\tj", trm.lastOutput("tako\t \t j"));
		assertEquals("lastOutput method should remove the space after all Tab  ", "tako\n\nj", trm.lastOutput("tako\n \n j"));

	}

}
