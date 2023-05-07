package com.sgtesting.patterns;
        //columns starting with same no i.e 5 4 3 2 1
  //                                        5 4 3 2 
//                                          5 4 3 
//                                          5 4
//                                          5
public class PatternTrail8For {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
//variable 'p' is declared to 5 so that column 1 starts with 5 only
//i.e 5 is initializing in column 1 every time			
			int p=5;
	     //k is equal to i
			for(int k=i;k<=n;k++)
			{
				System.out.print(p+" ");
				p--;
			}
			System.out.println();
		}

	}

}
