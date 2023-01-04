package com.sgtesting.LoopStatements;

public class WCountDivi5_170to70 {

	public static void main(String[] args) {
		int count=0;
		int i=170;
		while(i>=70)
		{
			if(i%5==0)
			{
				count++;
			}i--;
		}
		System.out.println(count);
	}

}
