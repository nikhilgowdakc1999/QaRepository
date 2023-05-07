package com.sgtesting.constructor;

public class PrimenosinArray {

	public static void main(String[] args) {
		int flag=0;
		for(int k=2;k<=50;k++)
		{
		int count=0;
		for(int i=2;i<k;i++)
		{
			if (k%i==0)
			{
				count++;
				
			}
		}
		if(count==0)
		{
			flag++;
		}
		}
		System.out.println("# of prime no: "+flag);
		//Declaration of array
	    int a[]=new int[flag];
	    
	    int n=0;
		for(int k=2;k<=50;k++)
		{
		int count=0;
		for(int i=2;i<k;i++)
		{
			if (k%i==0)
			{
				count++;
				
			}
		}
		if(count==0)
		{
			a[n]=k;
			n++;
		}
		}
		//important
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	}

