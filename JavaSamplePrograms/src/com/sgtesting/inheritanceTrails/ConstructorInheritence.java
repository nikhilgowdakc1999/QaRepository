package com.sgtesting.inheritanceTrails;
//Java Program to Illustrate
//Invocation of Constructor
//Calling Without Usage of
//super Keyword

//Class 1
//Super class
class Base {
	Base()
	{
		System.out.println(
			"Base Class Constructor Called ");
	}
}

//Class 2
//Sub class
class Derived extends Base {
	Derived()
	{
		System.out.println(
			"Derived Class Constructor Called ");
	}
}
//Class 3
//Main class
class ConstructorInheritence {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of sub class
		Derived d = new Derived();

		// Note: Here first super class constructor will be
		// called there after derived(sub class) constructor will be called
	}
}




