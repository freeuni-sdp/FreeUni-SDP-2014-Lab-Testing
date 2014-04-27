import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumbersTest {

	@Test
	public void testIntToRomanForOne() {
		
		assertEquals("I", RomanNumbers.intToRoman(1));
	}
	
	@Test
	public void testIntToRomanForOtherNumbersWithOneSymbol() {
		
		assertEquals("V", RomanNumbers.intToRoman(5));
	}

}
