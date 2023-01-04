package com.sgtesting.methodreturn;
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
	void Madd(int a[][],int b[][])
	{		
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[0].length;k++)
			{
				c[i][k]=a[i][k]+b[i][k];
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}
	}
}
public class Matadd2 {

	public static void main(String[] args) {

		int e[][]= {{1,2,3},{4,5,6}};
		MatrixADD2 a1=new MatrixADD2();
		int a[][]=a1.matrixa(e);
		int b[][]=a1.matrixb();
		//Method used as parameter in another method
		a1.Madd(a,b);
		System.out.println("$$$$$$$$$$$$$$$");
		//or
		a1.Madd(a1.matrixa(e),a1.matrixb());


	}

}
