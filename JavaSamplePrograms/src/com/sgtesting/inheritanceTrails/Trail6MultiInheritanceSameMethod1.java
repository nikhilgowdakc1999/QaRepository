package com.sgtesting.inheritanceTrails;
//Multilevel Inheritance with same method name and Signature(parameter)
class AA14
{
	void AA13(String name)
	{ 
		System.out.println(name);	
	}
}
class BB14 extends AA14
{
	BB14(String name)
	{
		super.AA13(name);	
	}
	void AA13(String name)
	{
		//to differentiate class AA14 and class BB14 print(method 2) if (name) is given it iterates 
		//	i.e niki comes twice

		System.out.println(name);
	}

}
class CC14 extends BB14
{
	CC14(String name)
	{
		//As the above subclass constructor and methods are interconnected they both should be 
		//	specified in subclass CC14
		super(name);
		super.AA13("sam");
	}
	void AA13(String name)
	{
		System.out.println(name);
	}

}
public class Trail6MultiInheritanceSameMethod1 {

	public static void main(String[] args) {

		CC14 a1=new CC14("niki");
		a1.AA13("vini");
	}

}
