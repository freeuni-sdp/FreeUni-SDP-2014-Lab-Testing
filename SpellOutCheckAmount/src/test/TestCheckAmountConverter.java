package src.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.main.CheckAmountConverter;

public class TestCheckAmountConverter
{
	private CheckAmountConverter converter;
	
	@Before
	public void init()
	{
		converter = new CheckAmountConverter();
	}
	
	@Test
	public void testClassApi()
	{
		assertEquals("one must be equel to 1", "one", converter.convert(1));
	}
	
	@Test
	public void testSimpleDecimalNumbers()
	{
		assertEquals("twenty one must be equal to 21", "twenty one", converter.convert(21));
		
		assertEquals("seventy one must be equal to 71", "seventy one", converter.convert(71));
		
		assertEquals("ninty three must be 93", "ninty three", converter.convert(93));
	}
	
	

}
