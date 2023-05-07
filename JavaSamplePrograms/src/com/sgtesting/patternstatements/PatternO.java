package com.sgtesting.patternstatements;

public class PatternO {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n;k++)
			{
				if(i==5||k==1||k==5||i==1)
				{
				System.out.print(" "+"#");
				}
			}
			System.out.println();
		}

	}

}
