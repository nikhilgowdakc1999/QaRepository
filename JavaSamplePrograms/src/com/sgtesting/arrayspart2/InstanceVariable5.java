package com.sgtesting.arrayspart2;
class student
{
	String name;
	int rollno;
	String section;

	}
class university
{
	int codeno ;
	String name;
	String place;
}
class library
{
	String name;
	int roomno ;
	String incharge;
	
}
public class InstanceVariable5 {

	public static void main(String[] args) {
		student a= new student();
		a.name="santosh";
		a.rollno=02;
		a.section="b";
		System.out.println("name: "+a.name);
		System.out.println("rollno: "+a.rollno);
		System.out.println("section: "+a.section);
		System.out.println("---------------------");
		university b=new university();
		b.name="banglore university";
		b.codeno=001;
		b.place="jb campus";
		System.out.println("name: "+b.name);
		System.out.println("codeno: "+b.codeno);
		System.out.println("place: "+b.place);
		System.out.println("----------------------");
		library c=new library();
		c.name="civil library";
		c.roomno=10;
		c.incharge="shivu";
		System.out.println("name: "+c.name);
	    System.out.println("roomno: "+c.roomno);
		System.out.println("incharge: "+c.incharge);
	    System.out.println("----------------------");

	}

}
