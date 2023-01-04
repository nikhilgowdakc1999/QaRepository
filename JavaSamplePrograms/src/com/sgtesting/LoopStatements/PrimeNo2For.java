package com.sgtesting.LoopStatements;
//checking the given no is prime or not
public class PrimeNo2For {

	public static void main(String[] args) {
		int num=23;
		int count=0;
		//i=2 so 1 is neglected and i<num so num is also neglected
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		//other than 1 and num itself no other no divides prime
		if(count==0)
		{
			System.out.println(num+" is a prime no");	
		}
		else
		{
			System.out.println(num+"is not a prime no");	
		}
	}

}
