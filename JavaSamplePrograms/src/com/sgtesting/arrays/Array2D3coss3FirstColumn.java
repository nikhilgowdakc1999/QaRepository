package com.sgtesting.arrays;

public class Array2D3coss3FirstColumn {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},
				      {4,5,6},
				      {7,8,9}};

		for(int i=0;i<arr.length;i++)
		{
	//to read first column only k<=0
			for(int k=0;k<1;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}

	}

}
