package com.sgtesting.patterns;
//Increasing Triangle
public class PatternTrail2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{	
	   //k range is set to i i.e k<=i
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
