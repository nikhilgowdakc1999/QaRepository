package com.sginstitute.javatest4;
class AA
{
	void Display(String name)
	{
		System.out.println(name);
	}
}
class BB extends AA
{
	BB(String name)
	{
		super.Display(name);
	}
	void Display(String name)
	{
		System.out.println(name);	
	}

}
public class Test4Q2 {

	public static void main(String[] args) {
		BB a1=new BB("niki");
		a1.Display("vini");

	}

}
