package com.sgtesting.arrays;

public class Array2DStringReverse {

	public static void main(String[] args) {
		String arr[][]= {{"aa","ab","ac"},{"ba","bb","bc"},{"ca","cb","cc"}};
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int k=arr[i].length-1;k>=0;k--)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}


	}

}
