package com.sgtesting.methodreturn;
class RePrime
{
	boolean RPrime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class ReturnPrimenos2 {

	public static void main(String[] args) {
		RePrime a1=new RePrime();
		boolean value=a1.RPrime(6);
		if(value==true)
		{
			System.out.println("It is a prime");
		}
		if (value==false)
		{
			System.out.println("It is not a prime");
		}
		System.out.println("****************");
		for(int k=10;k<=20;k++)
		{
			if((a1.RPrime(k))==true)
			{
				System.out.println(k);
			}
		}
	}

}


