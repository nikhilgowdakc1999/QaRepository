package com.sgtesting.inheritance;
class Continent2
{
	Continent2(int x)
	{
		System.out.println(x);	
	}
}
class Country2 extends Continent2
{
	//important step
	Country2(String y)
	{
		super(1);
		//important step
		System.out.println(y);	
	}
}
class State2 extends Country2
{
	State2()
	{
		super("India");
		System.out.println("State2 class Constructor");	
	}
}
public class MultiParaConstInheritance {

	public static void main(String[] args) {
		
		State2 a1=new State2();
	}

}
