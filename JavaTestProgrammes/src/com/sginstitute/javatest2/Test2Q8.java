package com.sginstitute.javatest2;
//method to return cube of 1st 4 numbers in reverse order
class Cubefirst4nos
{
	int[] cube()
	{

		int a[]= {1,8,27,64};
		int p=0;
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
		//important step
			b[p]=a[i];
			p++;
		}
		return b;
	}
}
public class Test2Q8 {

	public static void main(String[] args) {

		Cubefirst4nos a1=new Cubefirst4nos();
		int c[]=a1.cube();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
