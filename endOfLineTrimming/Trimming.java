public class Trimming {

	public Trimming() {

	}

	public String lastOutput(String text) {
		if (text.equals(""))
			return text;
		
		for (int i = text.length() - 1; i >= 0; i--) {
			if(text.charAt(i) != ' '){
				text =  text.substring(0,i+1);
				break;
			}
		}
		return text;

	}
}
