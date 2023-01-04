package com.sgtesting.Methods;
class Factorial
{
	void facto(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
public class MethodFactorial {

	public static void main(String[] args) {
		Factorial a1=new Factorial();
		a1.facto(9);
		a1.facto(3);
		a1.facto(8);

	}

}
