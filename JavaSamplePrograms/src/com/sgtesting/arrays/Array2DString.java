package com.sgtesting.arrays;

public class Array2DString {

	public static void main(String[] args) {
		String arr[][]= {{"aa","ab","ac"},{"ba","bb","bc"},{"ca","cb","cc"}};
		for(int i=0;i<arr.length;i++)
		{
			for(int k=0;k<arr[i].length;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}


	}

}
