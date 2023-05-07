package com.sgtesting.inheritanceTrails;
//Multi-level inheritance with constructor overloading in super class
class AA6
{
	AA6(int x)
	{
		System.out.println(x);
	}
	AA6(String y)
	{
		System.out.println(y);
	}
}
class BB6 extends AA6
{
	BB6(int x)
	{
		super(x);
	}
	BB6(String y)
	{
		super(y);
	}
}
class CC6 extends BB6
{
	CC6(int x)
	{
		super(x);
	}
	CC6(String y)
	{
		super(y);
	}
}
public class Trail10MultiInheritanceConstOverLoading {

	public static void main(String[] args) {
		CC6 a1=new CC6(2);
		CC6 a2=new CC6("niki");

	}

}
