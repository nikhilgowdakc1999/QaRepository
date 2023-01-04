package com.sginstitute.javatest2;
//method to return 2-D double array
class Double2dArray
{
	double[][] double2()
	{
		double a[][]= {{1.6,5.7},{5.8,9.1}};
		return a;	
	}
}

public class Test2Q5 {

	public static void main(String[] args) {
		Double2dArray a1=new Double2dArray();
		double a[][]=a1.double2();
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[0].length;k++)
			{
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
	}

}
