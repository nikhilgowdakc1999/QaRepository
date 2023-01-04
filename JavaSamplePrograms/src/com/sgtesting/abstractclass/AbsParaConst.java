package com.sgtesting.abstractclass;
//Abstract superclass containing parameterized constructor
abstract class Student
{
	Student(String name)
	{
		System.out.println(name);
	}
}
class Sports extends Student
{
	Sports()
	{
	super("sam");
	}
}
public class AbsParaConst {

	public static void main(String[] args) {
	
		Sports a1=new Sports();
	}
}
