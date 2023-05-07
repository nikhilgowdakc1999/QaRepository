package com.sgtesting.constructiveoverloading;
class Metrocity
{
	Metrocity(String name)
	{
		System.out.println("Metrocity name: "+name);
	}
	Metrocity(int no,String type)
	{
		System.out.println("codeno: "+no+" type: "+type);
	}
	Metrocity(String location,int noofstaff)
	{
		System.out.println("location: "+location+" noofstaff: "+noofstaff);
	}
}
public class ConstOverloadingMetrocity {

	public static void main(String[] args) {
		Metrocity a1=new Metrocity("namma metro");
		Metrocity a2=new Metrocity(05,"electrified");
		Metrocity a3=new Metrocity("bangalore",3000);
	}
}
