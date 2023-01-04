package com.sgtesting.ThisOperator;
class person
{
	String firstname;
	int age;
	person(String fname,int age)
	{
		firstname=fname;
	//This operator is provided only to variables
		this.age=age;
		System.out.println("firstname: "+firstname);
		System.out.println("age: "+this.age);
	}
	void display() 
	{
		System.out.println("firstname: "+firstname);
		System.out.println("age: "+this.age);
	}
}
public class ThisWithInstanceVariable {

	public static void main(String[] args) {

		person a1=new person("santu",18);
	//object.
		a1.display();
	}

}
