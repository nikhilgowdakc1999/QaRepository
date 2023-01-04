package com.sgtesting.methodreturn;
class RetTable
{
	int[] Rtable(int a)
	{
		int p=0;
		int c[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			int res=a*i;
			c[p]=res;
			p++;
		}
		return c;
	}
}
public class ReturnTables {

	public static void main(String[] args) {

		RetTable a1=new RetTable();
		int b[]=a1.Rtable(9);
		for(int i=0;i<10;i++)
		{
			System.out.println(b[i]);
		}
	}

}
