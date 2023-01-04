package com.sgtesting.recurssion;
class CountDigi2
{
	int count=0;
	int i=5464;
//In recurssion to get only 1 answer single time use return method
	int CountDigi()
	{
		
		while(i>0)
		{
			count++;
			i/=10;
			CountDigi();
		}
		return count;
	}

}
public class RecurssiveCountOfDigits2 {

	public static void main(String[] args) {

		CountDigi2 a1=new CountDigi2();
		int a=a1.CountDigi();
		System.out.println(a);
	}

}
