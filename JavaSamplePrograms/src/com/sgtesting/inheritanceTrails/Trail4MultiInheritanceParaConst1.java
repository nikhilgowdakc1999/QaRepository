package com.sgtesting.inheritanceTrails;
//Multilevel inheritance with parameterized constructor
//to get single value no need of printing in subclasses chain it and give value in main method
class AA12
{
	 AA12(String name)
	{
		 
		System.out.println(name);	
	}
}
class BB12 extends AA12
{
	BB12(String name)
	{
		super(name);

	}
	
}
class CC12 extends BB12
{
	CC12(String name)
	{
		super(name);
	
	}
	
}
public class Trail4MultiInheritanceParaConst1 {

	public static void main(String[] args) {
		CC12 a1=new CC12("Niki");

	}

}
