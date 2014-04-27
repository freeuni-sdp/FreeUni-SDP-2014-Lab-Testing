public class RomanNumbers {

	private static int oneSymbolValues[] = new int[] { 1, 5, 10, 50, 100, 500,
			1000 };

	private static String getRomanValue(int number) {
		switch (number) {
		case 1:
			return "I";
		case 5:
			return "V";
		case 10:
			return "X";
		case 50:
			return "L";
		case 100:
			return "C";
		case 500:
			return "D";
		case 1000:
			return "M";

		default:
			return "";
		}

	}

	public static String intToRoman(int number) {
		String str = "";
		if (getRomanValue(number).equals("")) {

			for (int i = oneSymbolValues.length - 1; i >= 0; i--) {

				if (number % oneSymbolValues[i] == 0) {
					
					str += getRomanValue(oneSymbolValues[i]);
					number -= oneSymbolValues[i];
				}
				if(!getRomanValue(number).equals("")) break;
			}

			if (number == 0)
				return str;
			else
				return str + getRomanValue(number);

		} else
			return getRomanValue(number);

	}

	public static int romanToInt(String roman) {

		return 0;

	}

}
