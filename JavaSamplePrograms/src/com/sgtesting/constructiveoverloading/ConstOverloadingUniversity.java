package com.sgtesting.constructiveoverloading;
class University
{
	University(String name)
	{
		System.out.println("University name: "+name);
	}
	University(int no,String type)
	{
		System.out.println("codeno: "+no+" type: "+type);
	}
	University(String location,int noofstaff)
	{
		System.out.println("location: "+location+" noofstaff: "+noofstaff);
	}
}
public class ConstOverloadingUniversity {

	public static void main(String[] args) {

		University a1=new University(01,"govt");
		University a2=new University("jb campus",4500);
		University a3=new University("bangalore University");
	}

}
