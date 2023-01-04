package com.sginstitute.javatest1;
//char elements in 2D array in reverse order
public class Test1Q1 {

	public static void main(String[] args) {
		char arr[][]= {{'a','b','c'},{'d','e','f'}};
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
