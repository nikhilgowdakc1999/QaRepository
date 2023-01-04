package com.sgtesting.arrays;

public class Array2DdoubleReverse {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
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
