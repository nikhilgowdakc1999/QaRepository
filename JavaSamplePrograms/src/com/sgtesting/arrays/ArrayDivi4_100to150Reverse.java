package com.sgtesting.arrays;

public class ArrayDivi4_100to150Reverse {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=150;i++)
		{
			if(i%4==0)
			{
			count++;
			}
		}
		int arr[]=new int[count];
		int p=0;
		for(int k=150;k>=100;k--)
		{
			if(k%4==0)
			{
				arr[p]=k;
				System.out.println(arr[p]);
				p++;
			}
		}

	}

}
