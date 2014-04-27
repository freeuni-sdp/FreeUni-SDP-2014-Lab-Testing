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
		factory = new NumberToStringFactory(converter);
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
		assertEquals("twenty", factory.getDecade(2, 0));
		assertEquals("thirty", factory.getDecade(3, 0));
		assertEquals("forty", factory.getDecade(4, 0));
		assertEquals("ninty", factory.getDecade(9, 0));
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
	
	@Test
	public void testComplexDecimalNumbersInThousands()
	{
		assertEquals("one thousand one", converter.convert(1001));
		assertEquals("nine thousand seventy two", converter.convert(9072));
		assertEquals("twenty thousand one hundred", converter.convert(20100));
		assertEquals("one hundred one thousand twenty", converter.convert(101020));
	}
	
	@Test
	public void testDecimalNumbersInMillionsAndBillions()
	{
		assertEquals("one million one", converter.convert(1000001));
		assertEquals("ninty million seventy two", converter.convert(90000072));
		assertEquals("one billion", converter.convert(1000000000));
		assertEquals("one billion ninty million", converter.convert(1090000000));
	}
	
	@Test
	public void testNumbersBetweenTenAndTwenty()
	{
		assertEquals("eleven", converter.convert(11));
		assertEquals("ninteen", converter.convert(19));
		assertEquals("fifteen", converter.convert(15));
		assertEquals("twelve", converter.convert(12));
	}
	
	@Test
	public void testComplexTeenNumbers()
	{
		assertEquals("one hundred eleven", converter.convert(111));
		assertEquals("one thousand ninteen", converter.convert(1019));
		assertEquals("two hundred fifteen", converter.convert(215));
		assertEquals("eleven thousand one", converter.convert(11001));
		assertEquals("four million three hundred eleven thousand six hundred twelve", converter.convert(4311612));
	}
}
