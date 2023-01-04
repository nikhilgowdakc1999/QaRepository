package com.sgtesting.methodreturn;
class Matsub
{
	int[][] Msub(int a[][],int b[][],int c[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=a[i][k]-b[i][k];

			}

		}return c;
	}
}
public class ReturnMatSub {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,1,1},{2,2,2}};
		int c[][]=new int[a.length][a[0].length];
		Matsub a1=new Matsub();
		int p[][]=a1.Msub(a,b,c);
		for(int i=0;i<p.length;i++)
		{
			for(int k=0;k<p[i].length;k++)
			{
				System.out.print(p[i][k]+" ");
			}
			System.out.println();
		}
	}
}


