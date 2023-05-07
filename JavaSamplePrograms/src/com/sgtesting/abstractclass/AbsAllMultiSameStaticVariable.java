package com.sgtesting.abstractclass;
//Multilevel inheritance with all class abstract having same Static variable
abstract class AA9
{
	static String name;
     void display1()
	{
		System.out.println(name);
	}
}
abstract class BB9 extends AA9
{
	BB9()
	{
    //class is used as it is static variable
	 AA9.name="niki";
	}
	static String name;
	 void display2()
	{
		System.out.println(name);
	}
}
abstract class CC9 extends BB9
{
	CC9()
	{
		BB9.name="sam";
	}
	static String name;
	void display3()
	{
		System.out.println(name);
	}
}
class DD9 extends CC9
{
	DD9()
	{
		CC9.name="vini";
	}
} 

public class AbsAllMultiSameStaticVariable {

	public static void main(String[] args) {
		
		DD9 a1=new DD9();
		a1.display1();
		a1.display2();
		a1.display3(); 
	}

}
