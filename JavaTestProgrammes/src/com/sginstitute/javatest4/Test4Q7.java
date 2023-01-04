package com.sginstitute.javatest4;
class AA1
{
	String name;
	void display()
	{
		System.out.println(name);
	}
}
class BB1 extends AA1
{
	BB1(String name)
	{
		super.name=name;
	}
	String name;
	void show(String name)
	{
		System.out.println(name);
	}
}
public class Test4Q7 {

	public static void main(String[] args) {
		BB1 a1=new BB1("niki");
		a1.display();
		a1.show("vini");

	}

}
