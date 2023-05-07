package com.sgtesting.constructor;
//Boolean 1-D array
class Boolean
{
	boolean[] method()
	{
		boolean a[]= {true,false};
		return a;

	}
}

public class booleantrial {

	public static void main(String[] args) {
		Boolean o1=new Boolean();
		boolean t[]=o1.method();
		for(int i=0;i<t.length;i++)
		{	
			System.out.println(t[i]);
		}
	}

}
