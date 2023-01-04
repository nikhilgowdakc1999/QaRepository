package com.sgtesting.methodreturn;
class ReEven
{
	boolean Even(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class ReturnEven2 {

	public static void main(String[] args) {
		ReEven a1=new ReEven();
		for(int i=50;i<=80;i+=2)
		{
			if(a1.Even(i)==true);
			{
				System.out.println(i);
			}
		}
	}
}
