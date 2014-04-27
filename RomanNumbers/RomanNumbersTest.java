import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumbersTest {

	@Test
	public void testIntToRomanForOne() throws RomanNumbersException {
		
		assertEquals("I", RomanNumbers.intToRoman(1));
	}
	
	@Test 
	public void testIntToRomanForOtherNumbersWithOneSymbol() throws RomanNumbersException {
		
		assertEquals("V", RomanNumbers.intToRoman(5));
		assertEquals("X", RomanNumbers.intToRoman(10));
		assertEquals("L", RomanNumbers.intToRoman(50));
		assertEquals("C", RomanNumbers.intToRoman(100));
		assertEquals("D", RomanNumbers.intToRoman(500));
		assertEquals("M", RomanNumbers.intToRoman(1000));
	}
	
	@Test
	public void testIntToRomanForOtherNumbersWithSameSymbols() throws RomanNumbersException {
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
	public void testIntToRomanForOtherNumbersWithDifferentSymbols() throws RomanNumbersException {
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
	public void testIntToRomanForOtherNumbers() throws RomanNumbersException {
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
	
	@Test (expected=RomanNumbersException.class)
	public void testForNonExistingNumbers() throws RomanNumbersException {	
		RomanNumbers.intToRoman(-5);
		RomanNumbers.intToRoman(0);
		RomanNumbers.intToRoman(4000);
		RomanNumbers.intToRoman(5872);
	}
	
	
	@Test
	public void testRomanToIntForNumbersWithOneSymbol() throws RomanNumbersException {
		assertEquals(1, RomanNumbers.romanToInt("I"));
		assertEquals(5, RomanNumbers.romanToInt("V"));
		assertEquals(10, RomanNumbers.romanToInt("X"));
		assertEquals(50, RomanNumbers.romanToInt("L"));
		assertEquals(100, RomanNumbers.romanToInt("C"));
		assertEquals(500, RomanNumbers.romanToInt("D"));
		assertEquals(1000, RomanNumbers.romanToInt("M"));
		
	}
	
	@Test
	public void testRomanToIntForOtherNumbersWithSameSymbols() throws RomanNumbersException {
		assertEquals(2, RomanNumbers.romanToInt("II"));
		assertEquals(3, RomanNumbers.romanToInt("III"));
		assertEquals(20, RomanNumbers.romanToInt("XX"));
		assertEquals(30, RomanNumbers.romanToInt("XXX"));
		assertEquals(200, RomanNumbers.romanToInt("CC"));
		assertEquals(300, RomanNumbers.romanToInt("CCC"));
		assertEquals(2000, RomanNumbers.romanToInt("MM"));
		assertEquals(3000, RomanNumbers.romanToInt("MMM"));
	}
	
	@Test
	public void testRomanToIntForOtherNumbersWithDifferentSymbols() throws RomanNumbersException {
		assertEquals(11, RomanNumbers.romanToInt("XI"));
		assertEquals(17, RomanNumbers.romanToInt("XVII"));
		assertEquals(68, RomanNumbers.romanToInt("LXVIII"));
		assertEquals(85, RomanNumbers.romanToInt("LXXXV"));
		assertEquals(185, RomanNumbers.romanToInt("CLXXXV"));
		assertEquals(176, RomanNumbers.romanToInt("CLXXVI"));
		assertEquals(712, RomanNumbers.romanToInt("DCCXII"));
		assertEquals(3767, RomanNumbers.romanToInt("MMMDCCLXVII"));		
		
	}
	@Test
	public void testRomanToIntForOtherNumbers() throws RomanNumbersException {
		assertEquals(4, RomanNumbers.romanToInt("IV"));
		assertEquals(9, RomanNumbers.romanToInt("IX"));
		assertEquals(29, RomanNumbers.romanToInt("XXIX"));
		assertEquals(49, RomanNumbers.romanToInt("XLIX"));
		assertEquals(99, RomanNumbers.romanToInt("XCIX"));
		assertEquals(404, RomanNumbers.romanToInt("CDIV"));
		assertEquals(909, RomanNumbers.romanToInt("CMIX"));
		assertEquals(949, RomanNumbers.romanToInt("CMXLIX"));
		assertEquals(3999, RomanNumbers.romanToInt("MMMCMXCIX"));
		
		
		
			
	}
	@Test (expected=RomanNumbersException.class)
	public void testRomanToIntForInvalidSymbols() throws RomanNumbersException {
		RomanNumbers.romanToInt("elene");
		
		
	
	}
	
	@Test  (expected=RomanNumbersException.class)
	public void testRomanToIntForInvalidOrder1() throws RomanNumbersException {

		System.out.println(RomanNumbers.romanToInt("IIX"));
		

		
	
	}
	
	@Test  (expected=RomanNumbersException.class)
	public void testRomanToIntForInvalidOrder2() throws RomanNumbersException {

		System.out.println(RomanNumbers.romanToInt("CCIIX"));
	
	}
	
	
	@Test  (expected=RomanNumbersException.class)
	public void testRomanToIntForInvalidOrder3() throws RomanNumbersException {

		System.out.println(RomanNumbers.romanToInt("IM"));
	
	}
	
	
}
