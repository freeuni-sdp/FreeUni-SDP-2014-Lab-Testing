package src;

import java.util.Map;

public class EnglishToGeorgianConverter {
	private Map<String, String> map;
	
	public EnglishToGeorgianConverter() {
		init();
	}
	
	/**
	 * Converts text from English to Georgian
	 * @param englishText
	 * @return Georgian text
	 */
	public String convert(String englishText) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < englishText.length(); i++) {
			String value = map.containsKey(""+englishText.charAt(i)) ? map.get(""+englishText.charAt(i)) : "" +englishText.charAt(i);
			sb.append(value);
		}
		return sb.toString();
	}
	
	
	
	
	private void init() {
		map = new MapBuilder<String, String>()
				.put("a", "ა")
				.put("b", "ბ")
				.put("g", "გ")
				.put("d", "დ")
				.put("e", "ე")
				.put("v", "ვ")
				.put("z", "ზ")
				.put("T", "თ")
				.put("i", "ი")
				.put("k", "კ")
				.put("l", "ლ")
				.put("m", "მ")
				.put("n", "ნ")
				.put("o", "ო")
				.put("p", "პ")
				.put("J", "ჟ")
				.put("r", "რ")
				.put("s", "ს")
				.put("t", "ტ")
				.put("u", "უ")
				.put("f", "ფ")
				.put("q", "ქ")
				.put("R", "ღ")
				.put("y", "ყ")
				.put("S", "შ")
				.put("C", "ჩ")
				.put("c", "ც")
				.put("Z", "ძ")
				.put("w", "წ")
				.put("W", "ჭ")
				.put("x", "ხ")
				.put("j", "ჯ")
				.put("h", "ჰ")
				.build();
	}

}
