package src.main;

public class NumberToStringFactory 
{
	private CheckAmountConverter converter;

	public NumberToStringFactory(CheckAmountConverter checkAmountConverter) 
	{
		this.converter = checkAmountConverter;
	}

	public String getValueOf(int amount, int position)
	{
		String result = "";
		if (position%3 == 1)
		{
			result += getDecade(amount, position);
			return result;
		}
		if (position%3 == 0)
		{
			result += getDigit(amount);
			String hundreds = getHundredsKeyWord(position);
			
			if (!hundreds.equals(""))
			{
				if (converter.hasNotHundreds(position))
				{
					return result;
				}
				if (amount == 0) 
				{
					result += hundreds;
				}
				else
				{
					result += " " + hundreds;
				}
				
			}
			return result;
		}
		if (position%3 == 2)
		{
			if (amount == 0)
			{
				return result;
			}
			result += getDigit(amount) + " hundred";
		}
		
		
		return result;
	}

	public String getTeen(int teen)
	{
		switch (teen) {
		case 1:
			return "eleven";
		case 2:
			return "twelve";
		case 3:
			return "thirteen";
		case 4:
			return "forteen";
		case 5:
			return "fifteen";
		case 6:
			return "sixteen";
		case 7:
			return "seventeen";
		case 8:
			return "eighteen";
		case 9:
			return "ninteen";

		default:
			break;
		}
		return null;
	}

	public String getDigit(int amount)
	{
		if (amount == 1)
		{
			return "one";
		}
		if (amount == 2)
		{
			return "two";
		}
		if (amount == 3)
		{
			return "three";
		}
		if (amount == 4)
		{
			return "four";
		}
		if (amount == 5)
		{
			return "five";
		}
		if (amount == 6)
		{
			return "six";
		}
		if (amount == 7)
		{
			return "seven";
		}
		if (amount == 8)
		{
			return "eigh";
		}
		if (amount == 9)
		{
			return "nine";
		}
		return "";
	}

	public String getDecade(int amount, int position)
	{

		if (amount == 1)
		{
			if (amount == 1) {
				int teen = converter.checkTeen(position);
				if (teen > 0) {
					return getTeen(teen);
				}
			}
			return "ten";
		}
		if (amount == 2)
		{
			return "twenty";
		}
		if (amount == 3)
		{
			return "thirty";
		}
		if (amount == 4)
		{
			return "forty";
		}
		if (amount == 5)
		{
			return "fifty";
		}
		if (amount == 6) 
		{
			return "sixty";
		}
		if (amount == 7) 
		{
			return "seventy";
		}
		if (amount == 8)
		{
			return "eighty";
		}
		if (amount == 9)
		{
			return "ninty";
		}
		return "";
	}

	public String getHundredsKeyWord(int position) 
	{
		if (position == 3) 
		{
			return "thousand";
		}
		if (position == 6)
		{
			return "million";
		}
		if (position == 9)
		{
			return "billion";
		}
		return "";
	}
}
