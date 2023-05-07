package com.sgtesting.interface1;
//HybridInheritanceUingInterfaces
interface Continent8
{
	void showContinentname(String name);
}
interface country8 extends Continent8
{
	void showCountryname(String name);
}
interface State8 extends Continent8
{
	void showStatename(String name);	
}
interface City8 extends State8
{
	void showcityname(String name);
}
class city2 implements country8
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
class Street3 implements City8
{
	public void showcityname(String name)
	{
		System.out.println(name);
	}
	public void showStatename(String name)
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

		Street3 a=new Street3();
		a.showContinentname("Asia");
		a.showStatename("karnataka");
		a.showcityname("Tumkur");

		city2 a1=new city2();
		a1.showContinentname("Asia");
		a1.showCountryname("India");

	}

}
