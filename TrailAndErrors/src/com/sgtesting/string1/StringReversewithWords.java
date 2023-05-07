package com.sgtesting.string1;

public class StringReversewithWords {

	public static void main(String[] args) {

		ReverseWordsInString();
	}
	private static void ReverseWordsInString()
	{
		String s="Mysore and Bangalore";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			//important step
			System.out.print(a[i]+" ");
		}
	}

}
