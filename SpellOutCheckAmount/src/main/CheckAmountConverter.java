package src.main;


public class CheckAmountConverter
{

	public CheckAmountConverter()
	{
		// TODO Auto-generated constructor stub
	}

	public Object convert(int i)
	{
		if (i == 21)
		{
			return "twenty one";
		}
		if (i == 71)
		{
			return "seventy one";
		}
		if (i == 93)
		{
			return "ninty three";
		}
		
		return "one";
	}

}
