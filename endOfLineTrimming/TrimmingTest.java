import static org.junit.Assert.*;

import org.junit.Test;


public class TrimmingTest {
	Trimming trm = new Trimming();
	
	@Test
	public void testSpaceCases() {
//		assertEquals("lastOutput method should return empty String ", "", trm.lastOutput(""));
//		assertEquals("lastOutput method should remove the space at the end ", "tako", trm.lastOutput("tako "));
//		assertEquals("lastOutput method should remove all spaces at the end ", "tako", trm.lastOutput("tako    "));
//		assertEquals("lastOutput method should not remove the space in the word ", " tako japaridze", trm.lastOutput(" tako japaridze"));
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

		assertEquals("lastOutput method should remove the space after all enter and after all tab  ", "tako\t\njaparidze", trm.lastOutput("tako\t \n japaridze"));

		assertEquals("lastOutput method should remove only some spaces  ", "\t\n\n", trm.lastOutput("\t \n    \n "));
		
		assertEquals("lastOutput method should not remove anything  ", " ab\ncd", trm.lastOutput(" ab\ncd"));
		assertEquals("lastOutput method should remove the tab and enter at the end ", "tako ab\n\tcd japaridze", trm.lastOutput("tako ab\n\tcd japaridze\n\t"));
		

	}

}
