package com.sgtesting.inheritance;
//Multilevel Inheritance
class Student1
{
	Student1()
	{
		System.out.println("Student1 class Constructor");	
	}
}
class College1 extends Student1
{
	College1()
	{
		System.out.println("College1 class Constructor");	
	}
}
class Branch1 extends College1
{
	Branch1()
	{
		System.out.println("Branch1 class Constructor");	
	}
}
public class MultiInheritance {

	public static void main(String[] args) {

		Branch1 a1=new Branch1();

	}

}
