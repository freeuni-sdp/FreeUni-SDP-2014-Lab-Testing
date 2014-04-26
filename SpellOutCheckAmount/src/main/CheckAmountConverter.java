package src.main;


public class CheckAmountConverter
{
	
	private NumberToStringFactory factory;

	public CheckAmountConverter()
	{
		factory = new NumberToStringFactory();
	}

	public String convert(int i)
	{
		String result = "";
		result = factory.getValueOf(i);
		return result;
	}

}
