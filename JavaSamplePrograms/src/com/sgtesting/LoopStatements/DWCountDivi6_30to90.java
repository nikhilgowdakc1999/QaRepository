package com.sgtesting.LoopStatements;

public class DWCountDivi6_30to90 {

	public static void main(String[] args) {
		int count=0;
		int i=30;
		do 
		{
			if(i%6==0)
			{
				count++;
			}i++;
		}while(i<=90);

		System.out.println(count);
	}

}
