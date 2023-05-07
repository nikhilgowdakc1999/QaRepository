package com.sgtesting.patterns;
//    Floyd Triangle in sequence
public class PatternTrail9For {

	public static void main(String[] args) {
		// Pattern starting with 1  i.e 1
		//                              2 3     
		//		                        4 5 6     
		//		                        7 8 9 10     
		//		                        11 12 13 14 15
		//variable 'p' is declared to 1 @ the start so that it keeps on adding
		//inside the pattern in a sequence without number repeating	itself	
		int p=1;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//increasing triangle
			for(int k=1;k<=i;k++)
			{
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}

	}

}


