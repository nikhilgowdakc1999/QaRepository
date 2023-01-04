package com.sgtesting.Polymorphism2;
abstract class EmployeeWorkCulture2
{
	abstract void WorkCulture();
}
class Samarth extends EmployeeWorkCulture2
{
	void WorkCulture()
	{
		System.out.println("Sam WorkCulture :Respect");
	}
}
class Vinayak extends EmployeeWorkCulture2
{
	void WorkCulture()
	{
		System.out.println("Vini WorkCulture :Integrity");
	}
}
class Nikhil extends EmployeeWorkCulture2
{
	void WorkCulture()
	{
		System.out.println("Niki WorkCulture :TeamSpirit");
	}
}
public class EmployeeWorkCulture {

	public static void main(String[] args) {
		EmployeeWorkCulture2 Workculture=null;
		
		Workculture=new Samarth();
		Workculture.WorkCulture();
		
		Workculture=new Vinayak();
		Workculture.WorkCulture();
		
		Workculture=new Nikhil();
		Workculture.WorkCulture();

	}

}
