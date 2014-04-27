package src.main;

import java.util.ArrayList;


public class CheckAmountConverter
{
	
	private NumberToStringFactory factory;
	private int request;

	public CheckAmountConverter()
	{
		factory = new NumberToStringFactory(this);
	}

	public String convert(int i)
	{
		request = i;
		String result = "";
		StringBuilder sb = new StringBuilder();
		String amount1 = String.valueOf(i);
	
		String amount = reverse(amount1);
		ArrayList<String> words = new ArrayList<>();
		for (int j = amount.length()-1; j >= 0; j--) 
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

	public boolean hasNotHundreds(int position) {
		String amount = reverse(String.valueOf(request));
		try {
			if (amount.charAt(position) == '0' && amount.charAt(position+1) == '0' && amount.charAt(position+2) == '0') {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		
		return false;
	}
	
}
