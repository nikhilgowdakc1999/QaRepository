package com.sgtesting.arrays;

public class DoubleArrayDoWhileReverse {

	public static void main(String[] args) {
		double arr[]= {4.1565,45.1555,.516537,-156.85,65.7};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);

	}

}
