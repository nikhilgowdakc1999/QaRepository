package com.sgtesting.abstractclass;
//Abstract superclass containing static method
abstract class Cricket
{
	 static void display()
	{
		System.out.println("static method");
	}
	
}

public class AbsStaticMethod {

	public static void main(String[] args) {
		Cricket.display();
		
	}

}
