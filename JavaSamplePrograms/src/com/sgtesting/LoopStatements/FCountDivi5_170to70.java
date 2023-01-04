package com.sgtesting.LoopStatements;

public class FCountDivi5_170to70 {

	public static void main(String[] args) {
		int count=0;
		for(int i=170;i>=70;i--)
		{
			if(i%5==0) 
			{
				count++;
			}

		}System.out.println(count);
	}

}
