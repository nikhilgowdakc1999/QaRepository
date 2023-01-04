package com.sgtesting.arrays;

public class Array2DCharacter {

	public static void main(String[] args) {
		char arr[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
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
