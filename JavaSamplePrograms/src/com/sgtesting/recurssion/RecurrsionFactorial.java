package com.sgtesting.recurssion;
class FactorialRecur
{
	int facto(int num)
	
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num*facto(num-1);
		}
	}
}
public class RecurrsionFactorial {

	public static void main(String[] args) {

		FactorialRecur a1=new FactorialRecur();
		int a=a1.facto(6);
		System.out.println(a);
	}
}
