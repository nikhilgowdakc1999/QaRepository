package com.sginstitute.javatest2;
//method to return first 3 Even numbers
class Even3
{
	int[] Even()
	{
		int a[]= {2,4,6};
		return a;
	}
}


public class Test2Q1 {

	public static void main(String[] args) {

		Even3 a1=new Even3();
		int a[]=a1.Even();
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
	}

}
