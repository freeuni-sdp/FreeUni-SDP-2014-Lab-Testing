package src.main;

import java.util.ArrayList;


public class CheckAmountConverter
{
	
	private NumberToStringFactory factory;

	public CheckAmountConverter()
	{
		factory = new NumberToStringFactory();
	}

	public String convert(int i)
	{
		String result = "";
		StringBuilder sb = new StringBuilder();
		String amount1 = String.valueOf(i);
	
		String amount = reverse(amount1);
		ArrayList<String> words = new ArrayList<>();
		for (int j = amount.length()-1; j >=0; j--) 
		{
			String value = factory.getValueOf(Integer.parseInt(String.valueOf(amount.charAt(j))), j);
			if (!value.equals("")) 
			{
				words.add(value);
			}
		}
		
		for (int j = 0; j < words.size(); j++)
		{
			sb.append(words.get(j));
			if (j != words.size()-1)
			{
				sb.append(" ");
			}
		}
		
		result = sb.toString();
		return result;
	}


	public String reverse(String amount1) {
		String result = "";
		for (int i = amount1.length()-1; i >= 0; i--) {
			result += amount1.charAt(i);
		}
		return result;
	}
	
}
