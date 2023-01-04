package com.sgtesting.LoopStatements;

public class WCountDivi6_30to90 {

	public static void main(String[] args) {
		int count=10;
		int i=30;
		while(i<=90)
		{
			if(i%6==0)
			{
				count++;
			}i++;
		}
		System.out.println(count);
	}

}
