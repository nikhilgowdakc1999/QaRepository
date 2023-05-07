package com.sgtesting.arrays;

public class Array2D3cross3LastColumn {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0;i<arr.length;i++)
		{
	//to read first column only k<=0
			for(int k=arr[i].length-1;k<arr[i].length;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}


	}

}
