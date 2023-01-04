package com.sgtesting.LoopStatements;

public class DWCountEven250to500 {

	public static void main(String[] args) {
		int count=0;
		int i=250;
		do 
		{
			if(i%2==0)
			{
				count++;
			}i++;
		}while(i<=500);
		System.out.println(count);
	}

}
