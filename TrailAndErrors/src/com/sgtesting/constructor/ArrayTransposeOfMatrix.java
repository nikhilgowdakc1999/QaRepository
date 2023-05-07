package com.sgtesting.constructor;
//Transpose of Matrix of order 2*3
public class ArrayTransposeOfMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		//interchanging rows and column sizes for c[3][2]
		int c[][]=new int[a[0].length][a.length];
		//range set to i<3
		for(int i=0;i<a[0].length;i++)
		{
			//range set to i<2
			for(int k=0;k<a.length;k++)
			{
				c[i][k]=(a[k][i]);
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}

	}

}
