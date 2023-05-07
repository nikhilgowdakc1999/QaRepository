package com.sgtesting.interface1;
//MultipleiInheritanceUsingMoreThan3Interface
interface Animal61
{
	void displayAnimalname1(String name);
}
interface Birds61
{
	abstract void displayBirdsname(String name);
}
interface Humans61
{
	void displayHumanname(String name);
}
class Livingbeings implements Humans61,Birds61,Animal61
{
	public void displayHumanname(String name)
	{
		System.out.println(name);
	}
	public void displayAnimalname1(String name)
	{
		System.out.println(name);
	}
	public void displayBirdsname(String name)
	{
		System.out.println(name);
	}
}
public class MultipleiInheritanceUsingMoreThan3Interface {

	public static void main(String[] args) {
		Livingbeings a1=new Livingbeings();
		a1.displayAnimalname1("Lion");
		a1.displayBirdsname("Peacock");
		a1.displayHumanname("Adams");

	}
}
