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
	public void testIntToRomanForOtherNumbersWithSameSymbols() {
		assertEquals("II", RomanNumbers.intToRoman(2));		
		assertEquals("XX", RomanNumbers.intToRoman(20));
		assertEquals("CC", RomanNumbers.intToRoman(200));
		assertEquals("MM", RomanNumbers.intToRoman(2000));

		assertEquals("III", RomanNumbers.intToRoman(3));
		assertEquals("XXX", RomanNumbers.intToRoman(30));
		assertEquals("CCC", RomanNumbers.intToRoman(300));
		assertEquals("MMM", RomanNumbers.intToRoman(3000));
	}
	
	@Test
	public void testIntToRomanForOtherNumbersWithDifferentSymbols() {
		assertEquals("IV", RomanNumbers.intToRoman(4));		
		
	}
	
	
	
	

}
