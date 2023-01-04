package com.sgtesting.patternstatements;

public class PAttern9DoWhile {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=5;
			do
			{
				System.out.print(k);
				k--;
			}while(k>=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
