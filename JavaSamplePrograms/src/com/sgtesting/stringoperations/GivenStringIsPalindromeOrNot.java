package com.sgtesting.stringoperations;

public class GivenStringIsPalindromeOrNot {

	public static void main(String[] args) {

		Palindrome();
	}
	private static void Palindrome()
	{
		StringBuffer a1=new StringBuffer("Malayalam");
		StringBuffer a2=a1.reverse();
		boolean b=a1.equals(a2);
		if(b==true)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palidrome");
		}
		if(a1==a2)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palidrome");
		}

	}
}


