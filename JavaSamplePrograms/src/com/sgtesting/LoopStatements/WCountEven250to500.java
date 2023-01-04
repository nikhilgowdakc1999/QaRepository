package com.sgtesting.LoopStatements;

public class WCountEven250to500 {

	public static void main(String[] args) {
		int count=0;
		int i=250;
		while(i<=500)
		{
			if(i%2==0)
			{
				count++;
			}i++;
		}
		System.out.println(count);
	}

}
