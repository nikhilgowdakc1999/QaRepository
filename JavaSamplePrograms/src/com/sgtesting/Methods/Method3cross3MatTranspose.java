package com.sgtesting.Methods;
class MatTranspose
{
	void MTrans(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[0].length;k++)
			{
				b[i][k]=a[k][i];
				System.out.print(b[i][k]+" ");
			}
			System.out.println();
		}
	}
}

public class Method3cross3MatTranspose {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[a.length][a[0].length];
		MatTranspose a1=new MatTranspose();
		a1.MTrans(a,b);
	}

}
