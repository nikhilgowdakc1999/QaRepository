package com.sgtesting.patterns;
          //sand glass
public class PatternTrail7For {

	public static void main(String[] args) {
		int n=5;
		//i<n to reduce 1 row
		for(int i=1;i<n;i++)
		{	
	   //increasing Triangle of "  "
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
	   //decreasing Triangle of "* " and k<i to reduce 1 column
			for(int k=i;k<n;k++)
			{
				System.out.print("* ");
			}
	  //decreasing Triangle of "* "
			for(int k=i;k<=n;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		int l=5;
		for(int i=1;i<=l;i++)
		{	
	   //decreasing Triangle of "  "
			for(int k=i;k<=n;k++)
			{
				System.out.print("  ");
			}
	   //increasing Triangle of "* " and k<i to reduce 1 column
			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
	  //increasing Triangle of "* "
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}



	}

}
