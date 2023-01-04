package com.sgtesting.arrays;

public class ArraySquare1to10Reverse {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int p=0;
		for(int i=10;i>=1;i--)
		{
		int res=i*i;
		arr[p]=res;
		System.out.println(res);
		p++;
		}

	}

}
