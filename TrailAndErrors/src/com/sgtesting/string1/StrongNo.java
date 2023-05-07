package com.sgtesting.string1;
// Strong No 145=1!+4!+5!
//examples:
public class StrongNo {

	public static void main(String[] args)
	{
	    int num=145;
		int sum=0;
		int rem=0;
		for(int i=num;i>0;i/=10)
		{
			rem=i%10;
			//important step
			int fact=1;
			for(int j=1;j<=rem;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(sum==num)
		{
			System.out.println(num+" is a Strong number");
		}
		else
		{
			System.out.println(num+" is not a Strong number");
		}
	}
	
}
