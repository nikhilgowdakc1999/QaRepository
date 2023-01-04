package com.sginstitute.javatest2;
//method to return 2nd half of elements in given 1D array
class Secondhalf1Darray
{
	int [] Sechalf()
	{
		int a[]= {1,2,3,4,5,6};
		int p=0;
		//important step
		int b[]=new int[a.length/2];
		for(int i=a.length/2;i<a.length;i++)
		{
			b[p]=a[i];
			p++;
		}
		return b;
	}
}
public class Test2Q9 {

	public static void main(String[] args) {

		Secondhalf1Darray a1=new Secondhalf1Darray();
		int c[]=a1.Sechalf();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
