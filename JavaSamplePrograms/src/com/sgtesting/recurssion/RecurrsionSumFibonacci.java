package com.sgtesting.recurssion;
class FibonacciRecur
{
	int Fibo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		return (Fibo(n-2)+Fibo(n-1));
	}
}
public class RecurrsionSumFibonacci {

	public static void main(String[] args) {

		FibonacciRecur a1=new FibonacciRecur();
		int a=a1.Fibo(10);
		System.out.println(a);
	}

}
