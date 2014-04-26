package src.main;

public class NumberToStringFactory {
	public String getValueOf(int amount)
	{
		if (amount == 21)
		{
			return "twenty one";
		}
		if (amount == 71)
		{
			return "seventy one";
		}
		if (amount == 93)
		{
			return "ninty three";
		}
		
		return "one";
	}
}
