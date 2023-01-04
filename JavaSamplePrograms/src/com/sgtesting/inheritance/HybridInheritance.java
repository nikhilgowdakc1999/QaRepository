package com.sgtesting.inheritance;
//Hybrid Inheritance
class Continent
{
	Continent()
	{
		System.out.println( "Continent class Constructor");	
	}
}
class Country extends Continent
{
	Country()
	{
		System.out.println("Country class Constructor");	
	}
}
class State extends Continent
{
	State()
	{
		System.out.println("State class Constructor");	
	}
}
class City extends State
{
	City()
	{
		System.out.println("City class Constructor");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
	
		City a1=new City();
		State a2=new State();
	}
}
