package com.sgtesting.LoopStatements;

public class FCountDivi3_6_9 {

	public static void main(String[] args) {
		//count should be initialized before for loop only 
		int count=0;
		for(int i=10;i<=90;i++)
		{
			if(i%6==0&&i%3==0&&i%9==0) 
			{
				count++;	
			}	
		}
		System.out.println(count);
	}
}
