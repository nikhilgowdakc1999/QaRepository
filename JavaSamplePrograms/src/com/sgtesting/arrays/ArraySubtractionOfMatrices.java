package com.sgtesting.arrays;

public class ArraySubtractionOfMatrices {

	public static void main(String[] args) {
		int a[][]= {{1,1,1},{1,1,1}};
		int b[][]= {{2,2,2},{2,2,2}};
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=(a[i][k]-b[i][k]);
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}
	}
}


