package com.sgtesting.methodreturn;
class Resu2
{
	int[] res(int a[],int b[],int c[])
	{
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];		
		}
		for(int k=a.length;k<(a.length+b.length);k++)
		{
			//important step
			c[k]=b[k-a.length];
		}
		return c;
	}
}

public class ReturnResultantArray2 {

	public static void main(String[] args) {

		Resu2 a1=new Resu2();
		int a[]= {1,2,3,4};
		int b[]= {5,7,6,8,9,};
		int c[]=new int[a.length+b.length];
		int d[]=a1.res(a, b, c);
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}

	}

}
