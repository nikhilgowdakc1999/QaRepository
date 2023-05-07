package com.sgtesting.string1;
//Sum of two elements in array is equal to given no
public class SumInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int num=8;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==num)
				{
					System.out.println(a[i]+"+"+a[j]);
				}

			}
		}

	}

}
