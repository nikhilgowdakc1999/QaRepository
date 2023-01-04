package com.sginstitute.javatest3;
//Method overloading Multiplication Functionality
class MethodOverloading
{
	void Multiplication(int x,int y)
	{
	int res=(x*y);
	System.out.println("multiplication result:"+res);
	}
	void Multiplication(int x,int y,int z)
	{
		int res=(x*y*z);
		System.out.println("multiplication result:"+res);
	}
	}
public class Test3Q3 {

	public static void main(String[] args) {
		
		MethodOverloading a=new MethodOverloading();
		a.Multiplication(2, 4);
		a.Multiplication(5, 6, 8);
	}

}
