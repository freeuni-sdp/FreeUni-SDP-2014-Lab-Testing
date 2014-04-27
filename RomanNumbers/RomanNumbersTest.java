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
		assertEquals("XI", RomanNumbers.intToRoman(11));
		assertEquals("XVII", RomanNumbers.intToRoman(17));
		assertEquals("LXVIII", RomanNumbers.intToRoman(68));
		assertEquals("LXXXV", RomanNumbers.intToRoman(85));
		assertEquals("CLXXXV", RomanNumbers.intToRoman(185));
		assertEquals("CLXXVI", RomanNumbers.intToRoman(176));
		assertEquals("DCCXII", RomanNumbers.intToRoman(712));
		assertEquals("MMMDCCLXVII", RomanNumbers.intToRoman(3767));		
		
	}
	
	@Test
	public void testIntToRomanForOtherNumbers() {
		assertEquals("IV", RomanNumbers.intToRoman(4));
		assertEquals("IX", RomanNumbers.intToRoman(9));
		assertEquals("XCIX", RomanNumbers.intToRoman(99));
		assertEquals("XXIX", RomanNumbers.intToRoman(29));
		assertEquals("XLIX", RomanNumbers.intToRoman(49));
		assertEquals("CDIV", RomanNumbers.intToRoman(404));
		assertEquals("CMIX", RomanNumbers.intToRoman(909));
		assertEquals("CMXLIX", RomanNumbers.intToRoman(949));
		assertEquals("MMMCMXCIX", RomanNumbers.intToRoman(3999));		
			
	}
	
	@Test
	public void testForNonExistingNumbers() {
		
			
	}
	
	
	@Test
	public void testRomanToIntForNumbersWithOneSymbol() {
		assertEquals(1, RomanNumbers.romanToInt("I"));
		assertEquals(5, RomanNumbers.romanToInt("V"));
		assertEquals(10, RomanNumbers.romanToInt("X"));
		assertEquals(50, RomanNumbers.romanToInt("L"));
		assertEquals(100, RomanNumbers.romanToInt("C"));
		assertEquals(500, RomanNumbers.romanToInt("D"));
		assertEquals(1000, RomanNumbers.romanToInt("M"));
		
	}
	
	
	
	

}
