package com.sgtesting.LoopStatements;

public class DWCountDivi3_6_9 {

	public static void main(String[] args) {

		int count=0;
		int i=10;
		do 
		{
			if(i%3==0&&i%6==0&&i%9==0)	
			{
				count++;
			}
			i++;
		}while(i<=90);
		System.out.println(count);
	}

}
