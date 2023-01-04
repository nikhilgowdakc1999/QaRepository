package com.sgtesting.abstractclass;
//Hybrid Inheritance with abstract superclass containing some abstract method
abstract class AA6
{
	abstract void AB2();
	abstract void AC2();
}
class BB6 extends AA6
{
	void AB2()
	{
		System.out.println("Method2 AB2");
	}
	void AC2()
	{
		System.out.println("Method2 AC2");
	}

}
class CC6 extends AA6
{
	void AB2()
	{
		System.out.println("Method1 AB2");
	}
	void AC2()
	{
		System.out.println("Method1 AC2");
	}
}
class DD6 extends BB6
{
	DD6()
	{
		super.AB2();
	}
	// String provided to avoid duplicate constructors
	DD6(String name)
	{
		System.out.println(name);
		super.AC2();
	}
}
public class AbsclassAbsmethodsHybrid {

	public static void main(String[] args) {
		DD6 a1=new DD6();
		DD6 b1=new DD6("niki");

		CC6 a2=new CC6();
		a2.AB2();
		a2.AC2();


	}

}
