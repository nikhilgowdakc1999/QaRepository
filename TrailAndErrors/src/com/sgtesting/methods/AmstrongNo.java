package com.sgtesting.methods;

public class AmstrongNo {

	public static void main(String[] args) {
		int n=153;
		int rem,sum=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if (sum==n)
		{
			System.out.println("It is an Amstrong no");	
		}
		else
		{
			System.out.println("It is not an Amstrong no");
		}
	}

}
