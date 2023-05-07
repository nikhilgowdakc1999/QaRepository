package com.sgtesting.inheritanceTrails;
//Multilevel Inheritance with same method name and Signature(parameter)
class AA15
{
	void AA13(String name)
	{ 
		System.out.println(name);	
	}
}
class BB15 extends AA15
{
	BB15(String name)
	{
		super.AA13("niki");	
	}
	void AA13(String name)
	{
		System.out.println(name);
	}

}
class CC15 extends BB15
{
	CC15(String name)
	{
		//As the above subclass constructor and methods are interconnected they both should be 
		//	specified in subclass CC14
		super(name);
		super.AA13("sam");
		System.out.println(name);
	}
	void AA13(String name)
	{
		System.out.println(name);
	}

}
public class Trail7MultiInheritanceSameMethod2 {

	public static void main(String[] args) {
		CC15 a1=new CC15("vini");
		a1.AA13("benzeee");
	}

}
