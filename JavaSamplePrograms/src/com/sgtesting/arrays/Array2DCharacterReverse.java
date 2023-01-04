package com.sgtesting.arrays;

public class Array2DCharacterReverse {

	public static void main(String[] args) {
		char arr[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
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
