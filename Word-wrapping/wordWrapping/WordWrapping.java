package wordWrapping;

import java.util.ArrayList;



public class WordWrapping {

	
	public static ArrayList<String> wordWrap(String text, int length){
		ArrayList<String> resultStrings = new ArrayList<>();
		if(text.length() < length)
			resultStrings.add(text);
		else{
			for(int i = 0; i < text.length(); i++){
				String currString = "";
				for(int j = 0; j < length; j++){
					currString += text.charAt(i + j);
				}
				resultStrings.add(currString);
			}
		}
		return resultStrings;
		
		
	}
	
	
	
}
