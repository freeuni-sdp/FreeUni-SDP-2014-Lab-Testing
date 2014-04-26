package src.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.main.CheckAmountConverter;
import src.main.NumberToStringFactory;

public class TestCheckAmountConverter
{
	private CheckAmountConverter converter;
	private NumberToStringFactory factory;
	
	@Before
	public void init()
	{
		converter = new CheckAmountConverter();
		factory = new NumberToStringFactory();
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
	
	@Test
	public void testGetDigitMethodInFactory()
	{
		assertEquals("one", factory.getDigit(1));
		assertEquals("two", factory.getDigit(2));
		assertEquals("three", factory.getDigit(3));
		assertEquals("nine", factory.getDigit(9));
	}
	
	@Test
	public void testGetDecadeMethodInFactory()
	{
		assertEquals("twenty", factory.getDecade(2));
		assertEquals("thirty", factory.getDecade(3));
		assertEquals("forty", factory.getDecade(4));
		assertEquals("ninty", factory.getDecade(9));
	}
	
	@Test
	public void testReverseMethodInConverter()
	{
		assertEquals("airevi", converter.reverse("iveria"));
	}
	
	@Test
	public void testComplexDecimalNumbersInHundreds()
	{
		assertEquals("one hundred twenty one", converter.convert(121));
		assertEquals("six hundred twenty six", converter.convert(626));
		assertEquals("nine hundred ninty nine", converter.convert(999));
	}
	
	@Test
	public void testSimpleDecimalNumbersInThousands()
	{
		assertEquals("one thousand", converter.convert(1000));
		assertEquals("nine thousand", converter.convert(9000));
		assertEquals("twenty thousand", converter.convert(20000));
		assertEquals("one hundred thousand", converter.convert(100000));

	}

}
