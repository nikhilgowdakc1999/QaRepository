package com.sginstitute.javatest3;
//no-args constructor inside parameterized constructor of different class
class maths32
{
	maths32(int x)
	{
		maths35 b1=new maths35();
		System.out.println(x);
	}
}
class maths35
{
	maths35()
	{
		System.out.println("it is no-args constructor");
	}
}
public class Test3Q10 {

	public static void main(String[] args) {
		maths32 b=new maths32(3);
	}
}
