package com.sgtesting.methodreturn;
class MatrixAdd3
{
	int[][] matrixa() 
	{
		int a[][]= {{1,2,3},{4,5,6}};
		return a;
	}
	int[][]matrixb()
	{
		int b[][]= {{1,1,1},{2,2,2}};
		return b;
	}
	void MatAdd3()
	{
	//Method used within body of another method	
		int a[][]=matrixa();
	    int b[][]=matrixb();			
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
public class Matadd3 {

	public static void main(String[] args) {
		
		MatrixAdd3 a1= new MatrixAdd3();
		//below 2 lines not needed
		int a[][]=a1.matrixa();
		int b[][]=a1.matrixb();
		a1.MatAdd3();
	}

}
