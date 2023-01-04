package com.sgtesting.exceptionhandling;
class BasicMaths2
{
	static void Addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
	static void Subtraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
	static void Division(int x,int y)
	{
		try
		{
		int res=x/y;
		System.out.println(res);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This block executes always.....");
		}
	}
	static void Multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println(res);
	}
}
public class RuntimeError {

	public static void main(String[] args) {
		
		BasicMaths2.Addition(3, 8);
		BasicMaths2.Subtraction(6, 6);
		BasicMaths2.Division(10, 0);
		BasicMaths2.Multiplication(8, 3);
	}

}
