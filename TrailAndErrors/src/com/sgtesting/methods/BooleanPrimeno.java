package com.sgtesting.methods;
// prime no using return method of boolean type
class Primeno{
	boolean isprime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if (n%i==0)
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
public class BooleanPrimeno {

	public static void main(String[] args) {
		Primeno a1=new Primeno();
		for(int i=2;i<=50;i++)
		{
			if(a1.isprime(i)==true)
			{
              System.out.println(i);
			}
		}
	}
}
