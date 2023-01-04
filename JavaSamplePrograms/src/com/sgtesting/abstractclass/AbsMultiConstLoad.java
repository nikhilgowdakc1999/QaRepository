package com.sgtesting.abstractclass;
//Multilevel inheritance with abstract superclass containing Constructor overloading
abstract class Name_StNo2
{
	Name_StNo2(String x)
	{
		System.out.println(x);	
	}
	Name_StNo2(int y)
	{
		System.out.println(y);
	}
}
class Address2 extends Name_StNo2
{
	Address2(int y)
	{
		super(y);
	
	}
	Address2(String x)
	{
		super(x);
	}
}
class Landmark2 extends Address2
{
	Landmark2(int y)
	{
		super(y);
	
	}
	Landmark2(String x)
	{
		super(x);
	}
}
public class AbsMultiConstLoad {

	public static void main(String[] args) {
		
		Landmark2 a1=new Landmark2("vini");
		Landmark2 a2=new Landmark2(5);
	}

}
