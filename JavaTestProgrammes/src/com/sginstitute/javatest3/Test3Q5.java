package com.sginstitute.javatest3;
//Inst method within static method of same class
class Maths2
{
	void A2()
	{
		System.out.println("it is instance method 1");
	}
	static void B2()
	{
		//create object
		Maths2 a1=new Maths2();
		a1.A2();
		System.out.println("it is static method 2");
	}
}
public class Test3Q5 {

	public static void main(String[] args) {
	
		Maths2.B2();
	}

}
