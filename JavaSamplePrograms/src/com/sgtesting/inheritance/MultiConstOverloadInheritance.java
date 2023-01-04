package com.sgtesting.inheritance;
//Multilevel Inheritance Constructor Overloading in Super Class
class Name_StNo
{
	Name_StNo(String x)
	{
		System.out.println(x);	
	}
	Name_StNo(int y)
	{
		System.out.println(y);
	}
}
class Address extends Name_StNo
{
	Address(int y)
	{
		super(2);
		System.out.println(y);	
	}
	Address(String x)
	{
		super("Niki");
		System.out.println(x);
	}
}
class Landmark extends Address
{
	Landmark(int y)
	{
		super(3);
		System.out.println(y);	
	}
	Landmark(String x)
	{
		super("Sam");
		System.out.println(x);
	}
}
public class MultiConstOverloadInheritance {

	public static void main(String[] args) {
		
		Landmark a1=new Landmark(4);
		Landmark a2=new Landmark("vini");
	}

}
