package com.sgtesting.Polymorphism2;
abstract class Foodtastes2
{
	abstract void Taste();
}
class Uppittu extends Foodtastes2
{
	void Taste()
	{
		System.out.println("upittu taste:Salty");
	}
}
class Bhiryani extends Foodtastes2
{
	void Taste()
	{
		System.out.println("Bhiryani taste:Spicy");
	}
}
class Kesaribath extends Foodtastes2
{
	void Taste()
	{
		System.out.println("Kesaribath taste:Sweet");
	}
}
public class FoodTastes {

	public static void main(String[] args) {
		Foodtastes2 taste=null;
		
		taste=new Uppittu();
		taste.Taste();
		
		taste=new Bhiryani();
		taste.Taste();
		
		taste=new Kesaribath();
		taste.Taste();

	}

}
