
public class Trimming {
	
	public Trimming() {
		
	}
	
	public String lastOutput(String text){
		if(text.equals(""))return text;
		if(text.charAt(text.length()-1) == ' ' )
			text = text.substring(0,text.length()-1);
		return text;
		
	}
}
