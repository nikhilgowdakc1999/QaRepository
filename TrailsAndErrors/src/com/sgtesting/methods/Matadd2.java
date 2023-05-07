package com.sgtesting.methods;
class MatrixADD2
{
	int[][] matrixa(int a[][]) 
	{
		return a;
	}
	int[][]matrixb()
	{
		int b[][]= {{1,1,1},{2,2,2}};
		return b;
	}
	int[][] Madd(int a[][],int b[][])
	{		
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[0].length;k++)
			{
				c[i][k]=a[i][k]+b[i][k];	
			}	
		}
		return c;
	}
}
public class Matadd2 {

	public static void main(String[] args) {

		int e[][]= {{1,2,3},{4,5,6}};
		MatrixADD2 a1=new MatrixADD2();
		int a[][]=a1.matrixa(e);
		int b[][]=a1.matrixb();
		//Method used as parameter in another method
		int k[][]=a1.Madd(a,b);
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k[0].length;j++)
			{
				System.out.print(k[i][j]);
			}
			System.out.println();
		}
		System.out.println("$$$$$$$$$$$$$$$");
		//or
		int q[][]=a1.Madd(a1.matrixa(e),a1.matrixb());


	}

}
