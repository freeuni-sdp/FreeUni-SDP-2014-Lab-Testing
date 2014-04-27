public class RomanNumbers {

	private static int oneSymbolValues[] = new int[] { 1, 4, 5, 9 , 10, 40, 50,90, 100, 400, 500,
			900 , 1000 };

	private static String getRomanValue(int number) {
		
		switch (number) {
		case 1:
			return "I";
		case 4:
			return "IV";
		case 5:
			return "V";
		case 9:
			return "IX";
		case 10:
			return "X";
		case 40:
			return "XL";
		case 50:
			return "L";
		case 90:
			return "XC";
		case 100:
			return "C";
		case 400:
			return "CD";
		case 500:
			return "D";
		case 900:
			return "CM";
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

				
				
				while (number>=oneSymbolValues[i] && number != 0) {
					
					
					str += getRomanValue(oneSymbolValues[i]);
					number -= oneSymbolValues[i];

				}
			
				if (!getRomanValue(number).equals(""))
					return str + getRomanValue(number);
			}

			return str;			

		} else
			return getRomanValue(number);

	}

	public static int romanToInt(String roman) {

		return 0;

	}

}
