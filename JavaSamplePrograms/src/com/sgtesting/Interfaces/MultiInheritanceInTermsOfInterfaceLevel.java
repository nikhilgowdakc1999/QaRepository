package com.sgtesting.Interfaces;
//MultiInheritanceInTermsOfInterfaceLevel
interface Cricket6
{
	abstract void showplayername1(String name);	
}
interface Football6 extends Cricket6
{
//since all methods in interface are by default abstract 
	void showplayername2(String name);
}
interface hockey6 extends Football6
{
	void showplayername3(String name);
}
class Sports6 implements hockey6
{
	public void showplayername1(String name) 
	{
		System.out.println(name);
	}
	public void showplayername2(String name)
	{
		System.out.println(name);
	}
	public void showplayername3(String name)
	{
		System.out.println(name);
	}
}
public class MultiInheritanceInTermsOfInterfaceLevel {

	public static void main(String[] args) {
		Sports6 a1=new Sports6();
		a1.showplayername1("Kohli");
		a1.showplayername2("Messi");
		a1.showplayername3("Dhyan chand");

	}

}
