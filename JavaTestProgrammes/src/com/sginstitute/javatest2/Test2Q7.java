package com.sginstitute.javatest2;
//method it has return elements of given 1-D array in revere
class Reverse1Darray
{
	int[] RevArray()
	{
		int a[]= {1,2,3,4,5};
		int p=0;
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[p]=a[i];
			p++;
		}
		return b;
	}
}
public class Test2Q7 {

	public static void main(String[] args) {

		Reverse1Darray a1=new Reverse1Darray();
		int c[]=a1.RevArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
