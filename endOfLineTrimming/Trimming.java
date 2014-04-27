public class Trimming {

	public Trimming() {

	}

	public String lastOutput(String text) {
		if (text.equals(""))
			return text;
		text = check(text, '\t');
		text = check(text, '\n');
		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) != ' ') {
				text = text.substring(0, i + 1);
				break;
			}
		}
		return text;
	}

	/* zedmet spacebs moashlis tabis , enteris da a.sh shemtxvevashi */
	private String check(String text, char sub) {
		
		if (text.charAt(text.length() - 1) == sub)
			text = text.substring(0, text.length() - 1);
		
		String temp = "";
		int j;
		for(int i = 0; i < text.length(); i++){
			
			if(text.charAt(i) == sub){
				temp = text.substring(0,i) + sub;
				i++;
				
				for(j = i;j<text.length();j++){
					if(text.charAt(j) != ' '){						
						text = temp + text.substring(j);
						break;
					}
				}
				
				break;
				
			}
		}
		
		return text;

	}
}
