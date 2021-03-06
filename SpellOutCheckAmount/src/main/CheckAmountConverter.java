package src.main;

import java.util.ArrayList;


public class CheckAmountConverter
{
	
	private NumberToStringFactory factory;
	private long request;

	public CheckAmountConverter()
	{
		factory = new NumberToStringFactory(this);
	}

	public String convert(float requestAmount)
	{
		request = (long)requestAmount;
		String result = "";
		StringBuilder sb = new StringBuilder();
		
		String amount1 = Float.toString(requestAmount);
		
		boolean isInteger = amount1.indexOf(".") + 1 == amount1.length()-1 
								&& amount1.charAt(amount1.indexOf(".") + 1) == '0';
		
		long newRequest = 0;
		if (isInteger) {
			newRequest = (long)requestAmount;
			amount1 = Long.toString(newRequest);
		}
		
		String amount = reverse(amount1);
		
		String decimal = amount1.substring(amount1.indexOf(".") == -1 ? amount1.length() : amount1.indexOf("."));
		
		decimal = decimal + " dollar";
		amount = amount.substring(amount.indexOf(".")+1);
		
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
			
			if (isEqualToTeen(words.get(j)))
			{
				if (isNextDigit(words.get(j+1)))
				{
					j++;
				}
				else
				{
					if(nextSubStringDigit(words.get(j+1)) != null)
					{
						words.set(j+1, nextSubStringDigit(words.get(j+1)));
					}
				}
			}
			
			
			if (j != words.size()-1)
			{
				sb.append(" ");
			}
		}
		
		result = sb.toString();
		if (amount1.indexOf(".") == -1) {
			result += " dollar";
		} else {
			result += " and " + decimal;
		}
		return result;
	}

	private String nextSubStringDigit(String string)
	{
		for (int i = 1; i < 10; i++)
		{
			if (string.indexOf(factory.getDigit(i)) == 0)
			{
				return string.substring(factory.getDigit(i).length()+1);
			}
		}
		return null;
	}

	private boolean isNextDigit(String string) 
	{
		for (int i = 1; i < 10; i++)
		{
			if (factory.getDigit(i).equals(string))
			{
				return true;
				
			}
		}
		return false;
	}

	private boolean isEqualToTeen(String string)
	{
		for (int i = 1; i < 10; i++) 
		{
			if (factory.getTeen(i).equals(string)) 
			{
				return true;
			}
		}
		return false;
	}

	public String reverse(String amount1)
	{
		String result = "";
		for (int i = amount1.length()-1; i >= 0; i--)
		{
			result += amount1.charAt(i);
		}
		return result;
	}

	public boolean hasNotHundreds(int position)
	{
		String amount = reverse(String.valueOf(request));
		try
		{
			if (amount.charAt(position) == '0' && amount.charAt(position+1) == '0' && amount.charAt(position+2) == '0') 
			{
				return true;
			}
		} 
		catch (Exception e)
		{
			return false;
		}
		
		return false;
	}

	public int checkTeen(int position)
	{
		String amount = reverse(String.valueOf(request));
		try 
		{
			return Integer.parseInt(String.valueOf(amount.charAt(position-1)));
		} 
		catch (Exception e)
		{
		}
		return 0;
	}
	
}
