package com.sgtesting.arrays;

public class Array2Ddouble {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
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
