package com.sgtesting.patterns;
       //Hill Pattern
public class PatternTrail4 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{	
	   //Decreasing Triangle of "  "
			for(int k=i;k<=n;k++)
			{
				System.out.print("  ");
			}
	   //Increasing Triangle of "* " and k<i to reduce 1 column
			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
	  //Increasing Triangle of "* "
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
