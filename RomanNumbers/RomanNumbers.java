
public class RomanNumbers {

	
	
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
	public static String intToRoman(int number){
		return getRomanValue(number);
		
	}
	
	public static int romanToInt(String roman){
		
		return 0;
		
	
	}
	
}
