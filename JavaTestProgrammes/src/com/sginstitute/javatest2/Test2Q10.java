package com.sginstitute.javatest2;
class FirstCol
{
	int[] Col()
	{
		//important step
		int p=0;
		int a[][]= {{1,2,3},{4,5,6}};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<=0;k++)
			{
			b[p]=a[i][k];
			p++;
			}
		}
		return b;
	}
}
public class Test2Q10 {

	public static void main(String[] args) {
		FirstCol a1=new FirstCol();
		int c[]=a1.Col();
		for(int i=0;i<c.length;i++)
		{
          System.out.println(c[i]);
			
		}

	}

}
