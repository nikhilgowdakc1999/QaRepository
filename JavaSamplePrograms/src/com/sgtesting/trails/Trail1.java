package com.sgtesting.trails;
//static block without object creation
class Staticblock2
{
	static void display()
	{
		System.out.println("Static method");	
	}
	static
	{
		System.out.println("Static block");
	}
}

public class Trail1 {

	public static void main(String[] args) {

		Staticblock2.display();
	}

}
