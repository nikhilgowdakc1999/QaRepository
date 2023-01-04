package com.sgtesting.patternstatements;

public class Pattern8DoWhile {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(" * ");
				k++;
			}while(k<=4);
			System.out.println();
			i++;
		}while(i<=10);

	}

}
