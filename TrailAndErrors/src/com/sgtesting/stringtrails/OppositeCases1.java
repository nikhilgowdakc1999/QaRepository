package com.sgtesting.stringtrails;

public class OppositeCases1 {

	public static void main(String[] args)
	{
		String str = "GeEkSfOrGeEkS";
		String x = "";
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
			{
				x = x + Character.toLowerCase(ch);
			}
			else
			{
				x = x + Character.toUpperCase(ch);
			}
		}
		System.out.println(x);

	}

}

