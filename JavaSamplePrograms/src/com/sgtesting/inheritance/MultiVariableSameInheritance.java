package com.sgtesting.inheritance;
//Multilevel Inheritance same Variable
class AA31
{
	String name;
	void display1()
	{
		System.out.println(name);	
	}
}
class BB31 extends AA31
{
	String name;
	BB31()
	{
		super.name="niki";

	}

	void display2()
	{
		System.out.println(name);	
	}
}
class CC31 extends BB31
{
	
	String name;
	CC31()
	{
		super.name="Sam";	
	}
	void display3()
	{
		this.name="vini";
		System.out.println(name);
	}
}


public class MultiVariableSameInheritance {

	public static void main(String[] args) {

		CC31 a1=new CC31();
		a1.display1();
		a1.display2();
		a1.display3();
	}
}
