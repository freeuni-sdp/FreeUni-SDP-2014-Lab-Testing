package src.main;

public class NumberToStringFactory {

	public String getValueOf(int amount, int position) {
		String result = "";
		if (position%3 == 1)
		{
			result += getDecade(amount);
			return result;
		}
		if (position%3 == 0)
		{
			result += getDigit(amount);
			String hundreds = getHundredsKeyWord(position);
			
			if (hundreds != null)
			{
				result += hundreds;
			}
			return result;
		}
		if (position%3 == 2)
		{
			result += getDigit(amount) + " hundred";
		}
		
		
		return result;
	}

	public String getDigit(int amount) {
		if (amount == 1) {
			return "one";
		}
		if (amount == 2) {
			return "two";
		}
		if (amount == 3) {
			return "three";
		}
		if (amount == 4) {
			return "four";
		}
		if (amount == 5) {
			return "five";
		}
		if (amount == 6) {
			return "six";
		}
		if (amount == 7) {
			return "seven";
		}
		if (amount == 8) {
			return "eigh";
		}
		if (amount == 9) {
			return "nine";
		}
		return null;
	}

	public String getDecade(int amount) {

		if (amount == 1) {
			return "ten";
		}
		if (amount == 2) {
			return "twenty";
		}
		if (amount == 3) {
			return "thirty";
		}
		if (amount == 4) {
			return "forty";
		}
		if (amount == 5) {
			return "fifty";
		}
		if (amount == 6) {
			return "sixty";
		}
		if (amount == 7) {
			return "seventy";
		}
		if (amount == 8) {
			return "eighty";
		}
		if (amount == 9) {
			return "ninty";
		}
		return null;
	}

	public String getHundredsKeyWord(int position) {
		if (position == 3) {
			return " thousand";
		}
		if (position == 6) {
			return " million";
		}
		if (position == 9) {
			return " billion";
		}
		return null;
	}
}
