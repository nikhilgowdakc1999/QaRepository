package com.sgtesting.inheritanceTrails;
//Multilevel inheritance all classes containing same variable
class AA28
{
	String name;
	void display1()
	{
		System.out.println(name);
	}
}
class BB28 extends AA28
{
	BB28()
	{
		super.name="niki";
	}
	String name;
	void display2()
	{
		System.out.println(name);
	}
}
class CC28 extends BB28
{
	CC28()
	{
		super.name="sam";
	}

	String name;
	void display3(String name)
	{
		System.out.println(name);
	}
}
public class Trail9MultiInheritanceSameVariable2 {

	public static void main(String[] args) {

		CC28 a1=new CC28();
		a1.display1();
		a1.display2();
		a1.display3("vini");
	}

}
