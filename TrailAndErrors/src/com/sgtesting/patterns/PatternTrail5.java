package com.sgtesting.patterns;
        //Diamond Pattern
public class PatternTrail5 {

	public static void main(String[] args) {
		int n=5;
		//i<n to reduce 1 row
		for(int i=1;i<n;i++)
		{
			//decreasing triangle of "  "
			for(int k=i;k<=n;k++)
			{
				System.out.print("  ");
			}
			//increasing triangle of "* " and k<i to reduce 1 column
			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
			//increasing triangle of "* "
			for(int k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println(); 
		}
		//new variable 'l' declared for new set of row
		int l=5;
		for(int i=1;i<=l;i++)
		{
			//increasing triangle of "  "
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			//decreasing triangle of "* " and k<l to reduce 1 column
			for(int k=i;k<l;k++)
			{
				System.out.print("* ");
			}
			//decreasing triangle of "* "
			for(int k=i;k<=l;k++) 
			{
				System.out.print("* ");
			}
			System.out.println(); 
		}
	}
}

