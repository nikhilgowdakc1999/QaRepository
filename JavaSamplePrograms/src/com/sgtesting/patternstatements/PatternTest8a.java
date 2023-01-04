package com.sgtesting.patternstatements;

public class PatternTest8a {

	public static void main(String[] args) {
		int n=4;
		int p=1;
		int i=1;
		while(i<=n)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print((p=p+1)+" ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
