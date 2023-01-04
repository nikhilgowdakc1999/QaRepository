package com.sgtesting.exceptionhandling;
class Stringvalidation
{
	static int getcharactercount(String s) throws Exception
	{
		if(s==null)
		{
			throw new Exception("Please provide valid string,never provide null as input!!");	
		}
		return s.length();
	}
}
public class ThrowAndThrows {

	public static void main(String[] args) {

		try
		{
			int a1=Stringvalidation.getcharactercount("java");
			System.out.println(a1);

			int b1=Stringvalidation.getcharactercount(null);
			System.out.println(b1);

		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
