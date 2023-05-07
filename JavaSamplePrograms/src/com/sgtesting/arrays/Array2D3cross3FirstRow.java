package com.sgtesting.arrays;

public class Array2D3cross3FirstRow {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		// to read first row only i<=0
		for(int i=0;i<1;i++)
		{
			for(int k=0;k<arr[i].length;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}

	}

}
