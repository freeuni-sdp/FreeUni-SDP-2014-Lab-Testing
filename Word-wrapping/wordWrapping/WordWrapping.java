package wordWrapping;

import java.util.ArrayList;



public class WordWrapping {

	
	public static ArrayList<String> wordWrap(String text, int length){
		ArrayList<String> resultStrings = new ArrayList<>();
		if(text.length() < length)
			resultStrings.add(text);
		
		return resultStrings;
		
		
	}
	
}
