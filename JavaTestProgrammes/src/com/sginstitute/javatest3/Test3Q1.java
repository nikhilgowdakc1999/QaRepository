package com.sginstitute.javatest3;
//Constructor overloading
class Employee
{
	Employee(String ename)
	{
		System.out.println("employee name:"+ename);
	}
	Employee(int eid)
	{
		System.out.println("employee idno:"+eid);
	}

}
public class Test3Q1 {

	public static void main(String[] args) {

		Employee a1=new Employee("Santu");
		Employee a2=new Employee(02);
	}

}
