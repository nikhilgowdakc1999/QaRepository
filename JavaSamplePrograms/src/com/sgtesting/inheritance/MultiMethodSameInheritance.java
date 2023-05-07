package com.sgtesting.inheritance;
//Multilevel Inheritance same Method
//method overriding
class Intl
{
	void AA10(String name)
	{
		System.out.println(name);	
	}
}
class Ipl2 extends Intl
{
	Ipl2()
	{
		super.AA10("niki");	
	}
	void AA10(String name)
	{
		
		System.out.println(name);	
	}
}
class Gully2 extends Ipl2
{
	Gully2(String name)
	{
    
	super.AA10(name);
	}
	 void AA10(String name)
	{
		 
		System.out.println(name);	
	}
}
public class MultiMethodSameInheritance {

	public static void main(String[] args) {
	
		Gully2 a1=new Gully2("vini");
		a1.AA10("sam");
	}
}


