package com.sgtesting.Polymorphism2;
abstract class HumanBehaviour2
{
	abstract void Behaviour();
}
class Sam extends HumanBehaviour2
{
	void Behaviour()
	{
		System.out.println("Sam Behaviour:Studious");
	}
}
class Vini extends HumanBehaviour2
{
	void Behaviour()
	{
		System.out.println("Vini Behaviour:Cool");
	}
}
class Niki extends HumanBehaviour2
{
	void Behaviour()
	{
		System.out.println("Niki Behaviour:Decent");
	}
}

public class HumanBehaviour {

	public static void main(String[] args) {
		HumanBehaviour2 Behave=null;
		 
		Behave=new Sam();
		Behave.Behaviour();
		
		Behave=new Vini();
		Behave.Behaviour();
		
		Behave=new Niki();
		Behave.Behaviour();

	}

}
