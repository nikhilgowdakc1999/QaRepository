package com.sgtesting.Methods;
class Array2D
{
	void column(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<=0;k++)
			{
				System.out.print(a[i][k]);
			}
			System.out.println();
		}
	}
}
public class Method1stcolOf2Darray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		Array2D a1=new Array2D();
		//important step
		a1.column(a);
	}
}
