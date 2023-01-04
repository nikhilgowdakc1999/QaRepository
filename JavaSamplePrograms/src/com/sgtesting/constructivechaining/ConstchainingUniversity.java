package com.sgtesting.constructivechaining;
class University
{
	University(String name)
	{
		System.out.println("University name: "+name);
	}
	University(int no,String type)
	{
		this("bangalore University");
		System.out.println("codeno: "+no+" type: "+type);
	}
	University(String location,int noofstaff)
	{
		this(01,"govt");
		System.out.println("location: "+location+" noofstaff: "+noofstaff);
	}
}
public class ConstchainingUniversity {

	public static void main(String[] args) {
	
		University a1=new University(02,"govt"); 
		University a2=new University("jb campus",5000);
	}

}
