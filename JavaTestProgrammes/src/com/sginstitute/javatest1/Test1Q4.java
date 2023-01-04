package com.sginstitute.javatest1;
//addition of two 1-D array
public class Test1Q4 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3};

		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=(a[i]+b[i]);
		}

		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");	
		}
		System.out.println();
	}
}

