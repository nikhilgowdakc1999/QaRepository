package com.sginstitute.javatest3;
//2 static method of different class
class Math8
{
	static void display1()
	{
		System.out.println("it is static method 1");	
	}
}
	class Maths9
	{
		static void Display2()
		{
			Math8.display1();
			System.out.println("it is static method 2");
		}
	}
	public class Test3Q9 {

		public static void main(String[] args) {
			
		Maths9.Display2();	
		}
	}
