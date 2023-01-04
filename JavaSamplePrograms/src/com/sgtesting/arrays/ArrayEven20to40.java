package com.sgtesting.arrays;

public class ArrayEven20to40 {

	public static void main(String[] args) {
		//size of array
		int count=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		//Declaration of array
		int even[]=new int[count];
		//insertion of values into array
		int p=0;
		for(int k=20;k<=40;k+=2)
		{
				even[p]=k;
				System.out.println(even[p]);
				p++;	
		}
	}
}




