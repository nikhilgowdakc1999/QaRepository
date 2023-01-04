package com.sgtesting.patternstatements;
//odd rows=1 && even rows=2
public class PatternTrail10For {

	public static void main(String[] args) {
		//pattern : 1
	    //          2 2
		//          1 1 1
		//          2 2 2 2
		//          1 1 1 1 1
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//increasing triangle
			for(int k=1;k<=i;k++)
			{
	   //since even & odd rows are to be selected
				if(i%2==0)
				{
				System.out.print(" 2");	
				}
				else
				System.out.print(" 1");
				
			
			}
			System.out.println();
		}

	}

}
