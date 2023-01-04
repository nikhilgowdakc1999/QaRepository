package com.sgtesting.patternstatements;
//Decreasing triangle
public class PatternTrail1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
	     //k is equal to i
			for(int k=i;k<=n;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
