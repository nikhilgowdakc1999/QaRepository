package com.sginstitute.javatest4;
//
class Addition
{
	static int add2(int x,int y)
	{
		int res=x+y;
		return res;
	}
}
public class Test4Q1 {

	public static void main(String[] args) {

		Addition a1=new Addition();
		int c=Addition.add2(3, 4);
		System.out.println(c);
	}

}
