package com.sgtesting.arrays;

public class Array9tableResults {

	public static void main(String[] args) {
	int	count=0;
	for(int k=1;k<=10;k++)
	{
	count++;
	}	
		int arr[]= new int[count];
		int p=0;
		for(int i=1;i<=10;i++)
		{
			int res=i*9;
			arr[p]=res;
			System.out.println(arr[p]);
			p++;
		}

	}

}
