package com.sgtesting.string1;
// sum of only integers in a given String 
public class SumOfNoInString {

	public static void main(String[] args) {
	//	sample1();
		sample2();
	}
	private static void sample1()
	{
		String str="a3b112d1c8";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c >= '0' && c <= '9')
			{
				sum=sum+Integer.parseInt(String.valueOf(c));		
			}
		}
		System.out.println(sum);
	}
	private static void sample2()
	{
		String str="a3b112d1c8";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if (Character.isDigit(c))
			{
				sum=sum+Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
	}
}
