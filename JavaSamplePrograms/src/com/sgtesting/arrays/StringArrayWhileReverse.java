package com.sgtesting.arrays;

public class StringArrayWhileReverse {

	public static void main(String[] args) {
		String arr[]= {"Vini","Sam","Niki"};
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;	
		}

	}

}
