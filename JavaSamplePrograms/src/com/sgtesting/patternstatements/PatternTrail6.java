package com.sgtesting.patternstatements;
      //Left Pascal's Triangle
public class PatternTrail6 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{	
	   //increasing triangle of " *"
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		int l=5;
		for(int i=1;i<=l;i++)
		{	
	   //decreasing triangle of " *"and k<l to remove 1 row
			
			for(int k=i;k<l;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
