package com.sgtesting.patternstatements;

public class Pattern5For {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for (int k=1;k<=i;k++)
			{

				System.out.print(" "+n+" ");
				n++;
			}
			System.out.println();
		}

	}

}
