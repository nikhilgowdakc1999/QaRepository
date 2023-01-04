package com.sgtesting.Interfaces;
//HybridInheritanceUingInterfaces
interface Continent8
{
	void showContinentname(String name);
}
interface country8 extends Continent8
{
	void showCountryname(String name);
}
class State8 implements Continent8
{
	public void showContinentname(String name)
	{
		System.out.println(name);
	}
}
//since interfaces continent8 & country8 r interconnected both should be implemented
class States81 implements country8,Continent8
{
	public void showCountryname(String name)
	{
		System.out.println(name);
	}
	public void showContinentname(String name)
	{
		System.out.println(name);
	}
}
public class HybridInheritanceUingInterfaces {

	public static void main(String[] args) {

		State8 a=new State8();
		a.showContinentname("Europe");
		
		States81 a1=new States81();
		a1.showContinentname("Asia");
		a1.showCountryname("India");

	}

}
