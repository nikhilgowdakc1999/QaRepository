package com.sginstitute.javatest3;
//static block within body of constructor of different classes
class Maths15
{
	Maths15()
	{
		Maths16 a1=new Maths16();
        System.out.println("it is a constructor");
	}
}
class Maths16
{
	static
	{	
		System.out.println("it is a static block");
	}
}
public class Test3Q7 {

	public static void main(String[] args) {
	
		Maths15 b1=new Maths15();
	}

}
