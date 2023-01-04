package com.sgtesting.trails;
class Students34
{
	void Students()
	{
		System.out.println("Student class");
	}
}
class College24 extends Students34
{
	void College()
	{
		System.out.println("College class");
	}
}
class Sports34 extends College24
{
	void Sports()
	{
		System.out.println("Sports class");
	}
}
public class Trail2 {

	public static void main(String[] args) {

		Sports34 a1=new Sports34();
		a1.Sports();
		a1.College();
		a1.Students();
	}

}
