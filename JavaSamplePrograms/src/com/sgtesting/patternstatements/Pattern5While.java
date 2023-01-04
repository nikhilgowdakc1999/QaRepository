package com.sgtesting.patternstatements;

public class Pattern5While {

	public static void main(String[] args) {
		int n=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				int	res=n++;
				System.out.print(" "+res+" ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
