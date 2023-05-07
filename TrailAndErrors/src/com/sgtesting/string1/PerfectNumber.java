package com.sgtesting.string1;

// perfect no 6=1+2+3
// examples for perfect no are 6,28,496,8128...
public class PerfectNumber {

	public static void main(String[] args) {

		int num=28;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;	
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is a perfect no");
		}
		else
		{
			System.out.println(num+" is not a perfect no");
		}
	}

}
