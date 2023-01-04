package com.sgtesting.arrays;

public class StringArrayDoWhileReverse {

	public static void main(String[] args) {
		String arr[]= {"Niki","Vini","Sam"};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);

	}

}
