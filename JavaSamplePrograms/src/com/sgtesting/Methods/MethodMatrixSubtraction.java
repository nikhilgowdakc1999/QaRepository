package com.sgtesting.Methods;
class MatrixSub
{
	void MSub(int a[][],int b[][],int c[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=a[i][k]-b[i][k];
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}
	}

}
public class MethodMatrixSubtraction {

	public static void main(String[] args) {
		int a[][]= {{3,3},{4,4}};
		int b[][]= {{1,2},{3,4}};
		// important step
		int c[][]=new int[a.length][a[0].length];
		MatrixSub a1=new MatrixSub();
		a1.MSub(a,b,c);
	}
}
