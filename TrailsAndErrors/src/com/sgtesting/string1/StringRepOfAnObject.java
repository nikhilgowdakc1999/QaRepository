package com.sgtesting.string1;
class Sample28
{
	String firstname;
	int age;
	Sample28(String fn,int age)
	{
		firstname=fn;
		this.age=age;
	}
	
	public String toString()
	{
		return "First Name of Student is "+firstname+" and age "+age;
	}
}
public class StringRepOfAnObject {

	public static void main(String[] args) {
	
		Sample28 obj=new Sample28("Santosh",19);
		System.out.println(obj);
	}

}
