package com.sgtesting.patternstatements;

public class Pattern7While {

	public static void main(String[] args) {
		int n=-1;
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
