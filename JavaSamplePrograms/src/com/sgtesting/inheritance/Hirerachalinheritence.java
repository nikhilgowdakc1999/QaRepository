package com.sgtesting.inheritance;
//Hierachal inheritance
class Student
{
	Student()
	{
		System.out.println("Student class Constructor");	
	}
}
class College extends Student
{
	College()
	{
		System.out.println("College class Constructor");	
	}
}
class Rollno extends Student
{
	Rollno()
	{
		System.out.println("Rollno class Constructor");	
	}
}
public class Hirerachalinheritence {

	public static void main(String[] args) {
		Rollno a1=new Rollno();
		College a2=new College();
	}

}
