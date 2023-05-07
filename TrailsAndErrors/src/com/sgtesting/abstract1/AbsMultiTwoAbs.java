package com.sgtesting.abstract1;
//Multilevel inheritance with abstract superclass and  abstract subclass containing two abstract methods
abstract class OutdoorSports
{
	abstract void Cricket();
	abstract void Football();
}
abstract class IndoorSports extends OutdoorSports
{
	abstract void Chess();
	abstract void Carrom();
}
class Sports21 extends IndoorSports
{
	void Cricket()
	{
		System.out.println("method 1");
	}
	void Football()
	{
		System.out.println("method 2");
	}
	void Chess()
	{
		System.out.println("method 3");
	}
	void Carrom()
	{
		System.out.println("method 4");
	}
}
public class AbsMultiTwoAbs {

	public static void main(String[] args) {
		Sports21 a1=new Sports21();
		a1.Cricket();
		a1.Football();
		a1.Chess();
		a1.Carrom();

	}

}
