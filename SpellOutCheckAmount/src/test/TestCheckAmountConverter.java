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
		assertEquals("one", converter.convert(1));
	}
	

}
