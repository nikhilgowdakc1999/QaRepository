package com.sgtesting.patternstatements;

public class Pattern2DoWhile {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(3);
				k++;
			}while (k<=i);
			System.out.println();
			i++;
		}while(i<=5);


	}

}
