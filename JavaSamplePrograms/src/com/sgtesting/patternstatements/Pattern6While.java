package com.sgtesting.patternstatements;

public class Pattern6While {

	public static void main(String[] args) {
		int n=0;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				int res=(n+=2);
				System.out.print(" "+res);
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
