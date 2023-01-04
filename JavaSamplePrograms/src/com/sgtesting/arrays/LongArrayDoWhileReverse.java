package com.sgtesting.arrays;

public class LongArrayDoWhileReverse {

	public static void main(String[] args) {
		long arr[]= {46545,46455,45437,-6485,4865667};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);

	}

}
