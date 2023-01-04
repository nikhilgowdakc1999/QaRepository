package com.sgtesting.arrays;

public class DoubleArrayWhileReverse {

	public static void main(String[] args) {
		double arr[]= {6.55,.65645,9.561,-51.11,-65.6};
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;	
		}

	}

}
