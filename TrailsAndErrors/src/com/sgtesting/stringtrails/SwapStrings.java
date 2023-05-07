package com.sgtesting.stringtrails;

public class SwapStrings {

	public static void main(String[] args) 
	{    
		String a = "Good ", b = "morning ";    
		System.out.println("Strings before swapping: " + a + " " + b);    

		//Concatenate both the string a and b and store it in a    
		a = a + b;    
		//Extract b from updated a    
		b = a.substring(0, (a.length() - b.length()));    
		//Extract a from updated a    
		a = a.substring(b.length());    

		System.out.println("Strings after swapping: " + a + " " + b);    
	}    
}    