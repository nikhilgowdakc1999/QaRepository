package com.sgtesting.arrays;

public class ByteArrayWhileReverse {

	public static void main(String[] args) {
		byte arr[]= {65,45,91,-81,-6};
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;	
		}

	}

}


