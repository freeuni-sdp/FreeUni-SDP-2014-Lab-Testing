package test;

import org.junit.Test;
import static org.junit.Assert.*;

import src.EnglishToGeorgianConverter;

public class Tests {
	
	@Test
	public void testCase1() {
		EnglishToGeorgianConverter converter = new EnglishToGeorgianConverter();
		assertEquals("გიორგი მამალაძე", converter.convert("giorgi mamalaZe"));
	}
	
	@Test
	public void testCase2() {
		EnglishToGeorgianConverter converter = new EnglishToGeorgianConverter();
		assertEquals("ჯოტია ცაავა", converter.convert("jotia caava"));
	}
	
	@Test
	public void testCase3() {
		EnglishToGeorgianConverter converter = new EnglishToGeorgianConverter();
		assertEquals("შედი ქალო ბუტკაში", converter.convert("Sedi qalo butkaSi"));
	}
	
	@Test
	public void testCase4() {
		EnglishToGeorgianConverter converter = new EnglishToGeorgianConverter();
		assertEquals("ამილახვარი", converter.convert("amilaxvari"));
	}

}
