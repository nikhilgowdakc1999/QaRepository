package com.sgtesting.inheritanceTrails;
//Multilevel inheritance with parameterized constructor
//to get values from each class print in subclasses chain it and give value in main method
class AA13
{
	 AA13(String name)
	{
		 
		System.out.println(name);	
	}
}
class BB13 extends AA13
{
	BB13(String name)
	{
		super("niki");
		System.out.println(name);
	}
	
}
class CC13 extends BB13
{
	CC13(String name)
	{
		super("sam");
		System.out.println(name);
	}
	
}
public class Trail5MultiInheritanceParaConst2 {

	public static void main(String[] args) {
		
		CC13 a1=new CC13("vini");
	}

}
