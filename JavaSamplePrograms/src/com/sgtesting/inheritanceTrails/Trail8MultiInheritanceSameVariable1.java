package com.sgtesting.inheritanceTrails;
//Multilevel inheritance all classes containing same variable
class AA27
{
	String name;
	void display1()
	{
		System.out.println(name);
	}
}
class BB27 extends AA27
{
	BB27(String name)
	{
		super.name=name;
	}
	String name;
	void display2()
	{
		System.out.println(name);
	}
}
class CC27 extends BB27
{
	CC27(String name)
	{
		//As the above subclass constructor and methods are interconnected they both should be 
		//specified in subclass CC14
		super(name);
		super.name=name;
	}

	String name;
	void display3(String name)
	{
		System.out.println(name);
	}
}
public class Trail8MultiInheritanceSameVariable1 {

	public static void main(String[] args) {

		CC27 a1=new CC27("Niki");
		// super class  display is enough
		a1.display1();
		a1.display2();
		a1.display3("vini");
	}

}
