package com.sgtesting.inheritanceTrails;
//Multilevel inheritance with only no-args constructor
class AA1
{
	 AA1()
	{
		
		System.out.println("AA1 class constructor");	
	}
}
class BB1 extends AA1
{
	BB1()
	{
		System.out.println("BB1 class constructor");
	}
	
}
class CC1 extends BB1
{
	CC1()
	{
		System.out.println("CC1 class constructor");
	}
	
}
public class Trail3MultiInheritanceNoArgs {

	public static void main(String[] args) {

		CC1 a1=new CC1();


	}

}
