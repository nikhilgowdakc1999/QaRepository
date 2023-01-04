package com.sgtesting.Interfaces;
//MultiInheritanceSubclassExtendsAbsclassplusimple2interface
interface AA76
{
void display1();
}
interface BB76
{
	void display2();
}
//since it is abstract super class
abstract class DD76 
{
	abstract void display3();
}
class CC76 extends DD76 implements AA76,BB76
{
	public void display1()
	{
		System.out.println("AA76 interface class");
	}
	public void display2()
	{
		System.out.println("BB76 interface class");
	}
	void display3()
	{
		System.out.println("DD76 super class");
	}
}


public class MultiInheritanceSubclassExtendsAbsclassplusimple2interface {

	public static void main(String[] args) {
		
		CC76 a1=new CC76();
		a1.display1();
		a1.display2();
		a1.display3();
	}

}
