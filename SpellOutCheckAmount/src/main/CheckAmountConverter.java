package src.main;


public class CheckAmountConverter
{
	
	private NumberToStringFactory factory;

	public CheckAmountConverter()
	{
		factory = new NumberToStringFactory();
	}

	public Object convert(int i)
	{
		return factory.getValueOf(i);
	}

}
