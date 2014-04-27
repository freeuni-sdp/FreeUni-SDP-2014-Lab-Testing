package wordWrapping;

import java.util.ArrayList;



public class WordWrapping {

	
	public static ArrayList<String> wordWrap(String text, int length){
		ArrayList<String> resultStrings = new ArrayList<>();
		
		if(text.length() == 0 || length < 1){
			return resultStrings;
		}else if(text.length() < length){
			resultStrings.add(text);
		}else{
			int startPos = 0;
			while(startPos < text.length()){
				while(text.charAt(startPos) == ' '){
					startPos += 1;
					if(startPos > text.length()) break;
				}

				String currString = "";
				if(length + startPos > text.length()){
					currString = text.substring(startPos);
				}else{
					currString = text.substring(startPos, length + startPos);
				}
				resultStrings.add(resultStrings.size(), currString);
				startPos = startPos + length;

			}
			
		}
		
		
		
		return resultStrings;
		
		
	}
	
	
	
}
