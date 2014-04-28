package wordWrapping;

import java.util.ArrayList;

public class WordWrapping {

	private static String georgianAlphabetString = "აბგდევზთიკლმნოპჟრსტუფქღყშჩცზწჭხჯჰ";
	private static String georgianVowels = "აეიოუ";
	
	public static ArrayList<String> wordWrap(String text, int length) {
		
		ArrayList<String> resultStrings = new ArrayList<>();

		if (text.length() == 0 || length < 1) 
			return resultStrings;
		else if (text.length() < length) { 
			resultStrings.add(text);
			return resultStrings;
		} else {
			
			if(georgianAlphabetString.contains(text.charAt(0)+ "")){
				return wrapGeorgian(text, length);
			}
			int startPos = 0;

			while (startPos < text.length()) {
				while (text.charAt(startPos) == ' ')
					startPos += 1;

				String currString = "";

				if (length + startPos >= text.length()) {
					currString = text.substring(startPos);
					resultStrings.add(currString);
					return resultStrings;
				} else {
					currString = text.substring(startPos, length + startPos);

					if (text.charAt(length + startPos) != ' ' && currString.contains(" "))
						currString = findLastSpaceAndSubstring(currString);
				}
				resultStrings.add(currString);
				startPos = startPos + currString.length();

			}
		}
		return resultStrings;

	}

	private static String findLastSpaceAndSubstring(String currString) {
		for (int i = currString.length() - 1; i > 0; i--) {
			if (currString.charAt(i) == ' ') {
				String res = currString.substring(0, i);
				return res;
			}
		}
		return currString;
	}
	
	private static ArrayList<String> wrapGeorgian(String text, int length){
		ArrayList<String> resultStrings= new ArrayList<>();
		int startPos = 0;

		while (startPos < text.length()) {
			while (text.charAt(startPos) == ' ')
				startPos += 1;

			String currString = "";

			if (length + startPos >= text.length()) {
				currString = text.substring(startPos);
				resultStrings.add(currString);
				return resultStrings;
			} else {
				currString = text.substring(startPos, length + startPos);

				if (text.charAt(length + startPos) != ' ' && currString.contains(" ")){
					
					currString = ifContainsVowelToWrap(currString);
							
					System.out.println(currString);
				}
			}
			resultStrings.add(currString);
			if(currString.charAt(currString.length() - 1) == '-'){
				startPos = startPos + currString.length() - 1;
			}else{
				startPos = startPos + currString.length();
			}

		}
		return resultStrings;
	}
	
	private static String ifContainsVowelToWrap(String currString){
		for (int i = currString.length() - 1; i > 0; i--) {
			if (currString.charAt(i) == ' ') {
				for(int j = i; j < currString.length(); j++){
					if(georgianVowels.contains(currString.charAt(j)+"")){
						return currString.substring(0, j + 1) + "-";
					}
				}
			}
		}
		return findLastSpaceAndSubstring(currString);
	}

}
