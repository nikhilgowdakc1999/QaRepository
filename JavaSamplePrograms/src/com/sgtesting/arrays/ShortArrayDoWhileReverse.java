package com.sgtesting.arrays;

public class ShortArrayDoWhileReverse {

	public static void main(String[] args) {
		short arr[]= {48,15,77,-5,7};
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);


	}

}
