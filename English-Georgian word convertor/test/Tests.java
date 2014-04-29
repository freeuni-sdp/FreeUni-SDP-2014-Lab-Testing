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

}
