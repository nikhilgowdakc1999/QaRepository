package com.sgtesting.LoopStatements;

public class FCountEven250to500 {

	public static void main(String[] args) {
		int count=0;
		for(int i=250;i<=500;i++)
		{
			if(i%2==0) 
			{
				count++;	
			}
		}
		System.out.println(count);
	}

}
