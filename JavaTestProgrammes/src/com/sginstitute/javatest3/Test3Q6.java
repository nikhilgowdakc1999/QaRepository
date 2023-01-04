package com.sginstitute.javatest3;
//2 instance block in two different classes
class Maths3
{
	{
		System.out.println("it is instance block 1");
	}
}
class Maths4
{
	{
	//object created for instance block 1 
		Maths3 a1=new Maths3();
	System.out.println("it is instance block 2");
	}
}
public class Test3Q6 {

	public static void main(String[] args) {
		Maths4 a2=new Maths4();

	}

}
