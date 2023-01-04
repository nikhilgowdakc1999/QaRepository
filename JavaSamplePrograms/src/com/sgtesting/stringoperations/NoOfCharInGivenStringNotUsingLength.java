package com.sgtesting.stringoperations;

public class NoOfCharInGivenStringNotUsingLength {

	public static void main(String[] args) {

		NoOfChar();
	}
	private static void NoOfChar()
	{
		String s="Nikhil";
		char a[]=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println("# of characters: "+count);
	}

}
