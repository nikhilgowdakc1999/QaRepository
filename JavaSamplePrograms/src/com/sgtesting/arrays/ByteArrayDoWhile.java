package com.sgtesting.arrays;

public class ByteArrayDoWhile {

	public static void main(String[] args) {
		byte arr[]= {54,46,-8,-128};
		int i=0;
		do 
		{
			System.out.println(arr[i]);
			i++;
		}while(i<arr.length);
	}
}
