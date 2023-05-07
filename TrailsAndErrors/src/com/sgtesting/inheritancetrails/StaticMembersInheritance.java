package com.sgtesting.inheritancetrails;
//Static members inheritance 
abstract class A
{
	static int n=20;
	static void method()
	{
		System.out.println("static method");
	}
}
class B extends A
{

}
public class StaticMembersInheritance {

	public static void main(String[] args) {
		//calling inherited static method
		B.method();
		//printing inherited static field
		System.out.println(B.n);
	}

}
