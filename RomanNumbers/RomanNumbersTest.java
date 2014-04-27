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
		assertEquals("X", RomanNumbers.intToRoman(10));
		assertEquals("L", RomanNumbers.intToRoman(50));
		assertEquals("C", RomanNumbers.intToRoman(100));
		assertEquals("D", RomanNumbers.intToRoman(500));
		assertEquals("M", RomanNumbers.intToRoman(1000));
	}
	
	@Test
	public void testIntToRomanForOtherNumbersWithManySymbols() {
		assertEquals("II", RomanNumbers.intToRoman(2));
		assertEquals("XX", RomanNumbers.intToRoman(20));
	}
	
	
	
	

}
