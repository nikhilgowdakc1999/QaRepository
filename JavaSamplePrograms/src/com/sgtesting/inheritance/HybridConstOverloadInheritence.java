package com.sgtesting.inheritance;
//Hybrid Inheritance constructor overloading in super class
class International
{
	International(int x)
	{
		System.out.println(x);	
	}
	International(String y)
	{
		System.out.println(y);
	}
}
class Ipl extends International
{
	Ipl(String y)
	{
		super("Niki");
		System.out.println(y);	
	}
	Ipl(int x)
	{
		super(2);
		System.out.println(x);
	}
}
class Ranji extends International
{
	Ranji(String y)
	{
		super("Ajith");
		System.out.println(y);	
	}
}
class Gully extends Ranji
{
	Gully(String y)
	{
		super("Vini");
		System.out.println(y);
	}
}
public class HybridConstOverloadInheritence {

	public static void main(String[] args) {
		
		Gully a1=new Gully("sam");
		Ipl a2=new Ipl(5);
		Ipl a3=new Ipl("Rahul");

	}

}
