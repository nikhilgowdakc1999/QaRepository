package com.sgtesting.arrays;

public class ArrayOdd71to41Reverse {

	public static void main(String[] args) {
		int count=0;
		for(int i=71;i>=41;i--)
		{
			if(i%2==1)
			{
				count++;	
			}
		}
		int odd[]=new int[count];
		int p=0;
		for(int k=41;k<=71;k+=2)
		{
			odd[p]=k;
			System.out.println(odd[p]);
			p++;
		}

	}

}
