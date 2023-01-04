package com.sgtesting.patternstatements;

public class Pattern9While {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=5;
			while(k>=i)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
			i++;
		}

	}

}
