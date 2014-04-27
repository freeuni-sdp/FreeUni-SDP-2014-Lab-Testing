
public class RomanNumbers {

	private static int intValues[] = new int[] { 1, 4, 5, 9, 10, 40, 50,
			90, 100, 400, 500, 900, 1000 };
	
	private static String RomanSymbols = "IVXLCDM";

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

	public static String intToRoman(int number) throws RomanNumbersException {
		if(number<=0 || number>=4000) throw new RomanNumbersException("out of range");
		String str = "";

		if (getRomanValue(number).equals("")) {

			for (int i = intValues.length - 1; i >= 0; i--) {

				while (number >= intValues[i] && number != 0) {

					str += getRomanValue(intValues[i]);
					number -= intValues[i];

				}

				if (!getRomanValue(number).equals(""))
					return str + getRomanValue(number);
			}

			return str;

		} else
			return getRomanValue(number);

	}

	private static int getIntValue(String roman) {

		switch (roman) {
		case "I":
			return 1;
		case "IV":
			return 4;
		case "V":
			return 5;
		case "IX":
			return 9;
		case "X":
			return 10;
		case "XL":
			return 40;
		case "L":
			return 50;
		case "XC":
			return 90;
		case "C":
			return 100;
		case "CD":
			return 400;
		case "D":
			return 500;
		case "CM":
			return 900;
		case "M":
			return 1000;

		default:
			return 0;
		}
	}

	public static int romanToInt(String roman) throws RomanNumbersException{
		int returnValue = 0;
		int last = 4000;
		int value = 0;
		if(!isValid(roman)) throw new RomanNumbersException("contains invalid symbols");
		for( int i =0 ; i <roman.length() ; i++){
			
			
			int twoSymboledNumber =0;
			
			if(i+2<=roman.length()){
				twoSymboledNumber = getIntValue(roman.substring(i,i+2));
				
				
			}
			if(twoSymboledNumber==0){
				value= getIntValue(roman.substring(i,i+1));
				
			}
			else{
				value=twoSymboledNumber;
				i++;
			}
			
			
			if(value >  last){
			
				throw new RomanNumbersException("invalid order");
			}
			else{
				returnValue += value;
				last = value;
			}
		}
		return returnValue;

	}

	private static boolean isValid(String roman) {
		for( int i =0 ; i <roman.length() ; i++){
			
			if(!RomanSymbols.contains(""+roman.charAt(i))) return false;
		}
		return true;
	}


}
