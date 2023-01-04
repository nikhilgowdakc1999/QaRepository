package com.sgtesting.patternstatements;

public class Pattern7DoWhile {

	public static void main(String[] args) {
		int n=-1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				int res=(n+=2);
				System.out.print(" "+res);
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
