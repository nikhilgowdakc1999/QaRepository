package com.sgtesting.patternstatements;

public class Pattern6For {

	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=5;i++)
		{
			for (int k=1;k<=i;k++)
			{
				int res=(n+=2);
				System.out.print(" "+res+" ");
			}
			System.out.println();
		}
	}

}
