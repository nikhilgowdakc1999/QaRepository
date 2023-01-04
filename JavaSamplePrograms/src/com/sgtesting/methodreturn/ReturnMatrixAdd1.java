package com.sgtesting.methodreturn;

class Matadd1
{
	// int[][] data type
	int[][] Madd(int a[][],int b[][],int c[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=a[i][k]+b[i][k];
		
			}
		
		}return c;
	}
}
public class ReturnMatrixAdd1 {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,1,1},{2,2,2}};
		int c[][]=new int[a.length][a[0].length];
		Matadd1 a1=new Matadd1();
		int p[][]=a1.Madd(a,b,c);
		for(int i=0;i<p.length;i++)
		{
			for(int k=0;k<p[i].length;k++)
			{
				System.out.print(p[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of  Matrix");
		// Matrix sizes set to 3*2
        int q[][]=new int[p[0].length][p.length];
		for (int i=0;i<p[0].length;i++)
		{
			for(int k=0;k<p.length;k++)
			{
             q[i][k]=p[k][i];
             System.out.print(q[i][k]+" ");
			}
			System.out.println();
		}
		
	}

}
