package com.sgtesting.recurse;
class Fibonacci1
{
	int first=0;
//not possible to give print here as no constructor/method are used 
	int second=1;
	int a=1;
//since we are getting sequence of numbers in recurrsion use void method or 
//return method also
	void fibo()
	{
		if(a<10)
		{
			int third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			a++;
			fibo();	
		}
	}
}
public class RecurssionFibonacci {

	public static void main(String[] args) {
		Fibonacci1 a1=new Fibonacci1();
		System.out.println(a1.first);
		System.out.println(a1.second);
		a1.fibo();
	}

}
