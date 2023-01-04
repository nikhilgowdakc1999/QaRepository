package com.sgtesting.noargsconstructor;
class student
{
	String name;
	int rollno;
	String section;
student()
{
	name="santosh";
	rollno=02;
	section="b";
	System.out.println("name: "+name);
	System.out.println("rollno: "+rollno);
	System.out.println("section: "+section);
	System.out.println("---------------------");	
}
	}
class university
{
	int codeno ;
	String name;
	String place;
	university()
	{
		name="banglore university";
		codeno=001;
		place="jb campus";
		System.out.println("name: "+name);
		System.out.println("codeno: "+codeno);
		System.out.println("place: "+place);
		System.out.println("----------------------");	
	}
}
class library
{
	String name;
	int roomno ;
	String incharge;
	library()
	{
		name="civil library";
		roomno=10;
		incharge="shivu";
		System.out.println("name: "+name);
	    System.out.println("roomno: "+roomno);
		System.out.println("incharge: "+incharge);
	    System.out.println("----------------------");	
	}
	
}
public class InstanceVariable5 {

	public static void main(String[] args) {
		student a= new student();
		
		university b=new university();
		
		library c=new library();
		

	}

}
