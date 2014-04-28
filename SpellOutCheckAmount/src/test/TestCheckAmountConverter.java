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
		assertEquals("one must be equel to 1", "one dollar", converter.convert(1));
	}
	
	@Test
	public void testSimpleDecimalNumbers()
	{
		assertEquals("twenty one must be equal to 21", "twenty one dollar", converter.convert(21));
		
		assertEquals("seventy one must be equal to 71", "seventy one dollar", converter.convert(71));
		
		assertEquals("ninty three must be 93", "ninty three dollar", converter.convert(93));
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
	public void testComplexIntegerNumbersInHundreds()
	{
		assertEquals("one hundred twenty one dollar", converter.convert(121));
		assertEquals("six hundred twenty six dollar", converter.convert(626));
		assertEquals("nine hundred ninty nine dollar", converter.convert(999));
	}
	
	@Test
	public void testSimpleIntegerNumbersInThousands()
	{
		assertEquals("one thousand dollar", converter.convert(1000));
		assertEquals("nine thousand dollar", converter.convert(9000));
		assertEquals("twenty thousand dollar", converter.convert(20000));
		assertEquals("one hundred thousand dollar", converter.convert(100000));

	}
	
	@Test
	public void testComplexIntegerNumbersInThousands()
	{
		assertEquals("one thousand one dollar", converter.convert(1001));
		assertEquals("nine thousand seventy two dollar", converter.convert(9072));
		assertEquals("twenty thousand one hundred dollar", converter.convert(20100));
		assertEquals("one hundred one thousand twenty dollar", converter.convert(101020));
	}
	
	@Test
	public void testIntegerNumbersInMillionsAndBillions()
	{
		assertEquals("one million one dollar", converter.convert(1000001));
		assertEquals("nine hundred thousand seventy two dollar", converter.convert(900072));
	}
	
	@Test
	public void testNumbersBetweenTenAndTwenty()
	{
		assertEquals("eleven dollar", converter.convert(11));
		assertEquals("ninteen dollar", converter.convert(19));
		assertEquals("fifteen dollar", converter.convert(15));
		assertEquals("twelve dollar", converter.convert(12));
	}
	
	@Test
	public void testComplexTeenNumbers()
	{
		assertEquals("one hundred eleven dollar", converter.convert(111));
		assertEquals("one thousand ninteen dollar", converter.convert(1019));
		assertEquals("two hundred fifteen dollar", converter.convert(215));
		assertEquals("eleven thousand one dollar", converter.convert(11001));
		assertEquals("four million three hundred eleven thousand six hundred twelve dollar", converter.convert(4311612));
	}
	
	@Test
	public void testDecimalNumbers()
	{
		assertEquals("one hundred eleven and .123 dollar", converter.convert(111.123F));
		assertEquals("one thousand ninteen and .009 dollar", converter.convert(1019.009F));
		assertEquals("two hundred fifteen and .21 dollar", converter.convert(215.21F));
		assertEquals("eleven thousand one and .01 dollar", converter.convert(11001.01F));
	}
	
}
