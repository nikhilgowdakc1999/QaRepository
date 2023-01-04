package com.sgtesting.patternstatements;

public class Pattern8While {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			int k=1;
			while(k<=4) 
			{
				System.out.print(" * ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
