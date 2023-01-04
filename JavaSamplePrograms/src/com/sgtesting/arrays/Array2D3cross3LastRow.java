package com.sgtesting.arrays;

public class Array2D3cross3LastRow {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//to read last row only i=arr.length
		for(int i=arr.length-1;i<arr.length;i++)
		{
			for(int k=0;k<arr[i].length;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}

	}

}
