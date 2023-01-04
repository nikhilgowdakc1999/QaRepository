package com.sgtesting.constructorlogic;
class Matadd
{
	Matadd(int a[][],int b[][],int c[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=a[i][k]+b[i][k];
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}
	}

}
public class ConstMatrixAddition {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,1,1},{2,2,2}};
		int c[][]=new int[a.length][a[0].length];
		Matadd a1=new Matadd(a,b,c);

	}

}
