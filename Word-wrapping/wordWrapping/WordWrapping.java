package wordWrapping;

import java.util.ArrayList;



public class WordWrapping {

	
	public static ArrayList<String> wordWrap(String text, int length){
		ArrayList<String> resultStrings = new ArrayList<>();
		
		if(text.length() < length){
			resultStrings.add(text);
		}else{
			int startPos = 0;
			while(startPos < text.length()){
				String currString = "";
				if(length + startPos > text.length()){
					currString = text.substring(startPos);
				}else
					currString = text.substring(startPos, length + startPos);
				resultStrings.add(resultStrings.size(), currString);
				startPos = startPos + length;
			}
			
		}
		
		
		return resultStrings;
		
		
	}
	
	
	
}
