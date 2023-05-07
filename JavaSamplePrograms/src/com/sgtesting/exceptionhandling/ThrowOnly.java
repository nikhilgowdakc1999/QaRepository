package com.sgtesting.exceptionhandling;

class Stringvalidation2
{
	static void getcharactercount(String s)
	{
		try
		{
		//important step
			if(s==null)
			{
				throw new Exception("Please provide valid string,never provide null as input!!");	
			}
			int i=s.length();
			System.out.println(i);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class ThrowOnly {

	public static void main(String[] args) {

		Stringvalidation2.getcharactercount("Niki");
		Stringvalidation2.getcharactercount(null);
	}
	
}
