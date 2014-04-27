public class Trimming {

	public Trimming() {

	}

	public String lastOutput(String text) {
		if (text.equals(""))
			return text;
		text = check(text, "\t");
		text = check(text, "\n");
		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) != ' ') {
				text = text.substring(0, i + 1);
				break;
			}
		}
		return text;
	}

	/* zedmet spacebs moashlis tabis , enteris da a.sh shemtxvevashi */
	private String check(String text, String sub) {
		
		if (text.substring(text.length() - 1).equals(sub))
			text = text.substring(0, text.length() - 1);
		return text;

	}
}
