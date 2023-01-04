package com.sgtesting.abstractclass;
//Multilevel inheritance with all class abstract having same Instance variable
abstract class AA8
{
	String name;
	void display1()
	{
		System.out.println(name);
	}
}
abstract class BB8 extends AA8
{
	BB8()
	{
		super.name="niki";
	}
	String name;
	void display2()
	{
		System.out.println(name);
	}
}
abstract class CC8 extends BB8
{
	CC8()
	{
		super.name="sam";
	}
	String name;
	void dispay3()
	{
		System.out.println(name);
	}
}
class DD8 extends CC8
{
   DD8()
     {
	super.name="vini";

     }
}
public class AbsAllMultiSameinstVariable {

	public static void main(String[] args) {
		DD8 a1=new DD8();
		a1.dispay3();
		a1.display2();
		a1.display1();

	}

}
