package com.sgtesting.recurssion;
class DigitsSum
{
	static int SumNo(int n)
	{
		int rem;
		int sum=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			sum=sum+rem;
		
		}
		return sum;
	}
}
public class SumofDigits {

	public static void main(String[] args) {
		
		DigitsSum g=new DigitsSum();
		int d= g.SumNo(4645486);
		System.out.println(d);
	}

}
