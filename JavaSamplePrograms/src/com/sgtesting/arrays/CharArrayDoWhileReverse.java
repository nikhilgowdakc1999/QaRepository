package com.sgtesting.arrays;

public class CharArrayDoWhileReverse {

	public static void main(String[] args) {
		char arr[]= {'j','d','f','e'};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);


	}

}
