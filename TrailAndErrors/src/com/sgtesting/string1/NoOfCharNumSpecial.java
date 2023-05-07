package com.sgtesting.string1;
//Java program to count the uppercase,
//lowercase, special characters
//and numeric values

public class NoOfCharNumSpecial {

	public static void main(String[] args)
	{
	//	sample1();
		sample2();
	}
	private static void sample1()
	{
		String str = "#GeeKs01fOr@gEEks07";
		int upper = 0, lower = 0, number = 0, special = 0;

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				upper++;
			}
			else if (ch >= 'a' && ch <= 'z')
			{
				lower++;
			}
			else if (ch >= '0' && ch <= '9')
			{
				number++;
			}
			else
			{
				special++;
			}
		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
	}
	private static void sample2()
	{
		String str = "#GeeKs01fOr@gEEks07";
		int upper = 0, lower = 0, number = 0, special = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				number++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}
			else if(Character.isUpperCase(ch))
			{
				upper++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
	}
}



