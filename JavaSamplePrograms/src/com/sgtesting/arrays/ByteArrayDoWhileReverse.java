package com.sgtesting.arrays;

public class ByteArrayDoWhileReverse {

	public static void main(String[] args) {
		byte arr[]= {45,55,37,-85,67};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);

	}		

}


