package com.sgtesting.parameterisedconstructor;
class student
{
	String name;
	int rollno;
	String section;
student(String n,int rn,String s)
{
	name=n;
	rollno=rn;
	section=s;
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
	university(int cn,String n,String p)
	{
		name=n;
		codeno=cn;
		place=p;
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
	library(String n,int rn,String i)
	{
		name=n;
		roomno=rn;
		incharge=i;
		System.out.println("name: "+name);
	    System.out.println("roomno: "+roomno);
		System.out.println("incharge: "+incharge);
	    System.out.println("----------------------");	
	}
	
}
public class InstanceVariable5 {

	public static void main(String[] args) {
		
		student a1= new student("Niki",5,"b");
		
		university b1=new university(01,"uvce","jb campus");
		
		library c1=new library("mech",02,"vini");
		
        student a2= new student("sam",7,"a");
		
		university b2=new university(02,"bmsce","basavangudi");
		
		library c2=new library("civil",10,"shivu");
		

	}

}
