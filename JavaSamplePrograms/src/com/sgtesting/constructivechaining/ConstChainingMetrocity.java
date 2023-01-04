package com.sgtesting.constructivechaining;
class Metrocity
{
	Metrocity(String name)
	{
		System.out.println("Metrocity name: "+name);
	}
	Metrocity(int no,String type)
	{
		this("bangalore");
		System.out.println("codeno: "+no+" type: "+type);
	}
	Metrocity(String location,int noofstaff)
	{
		this(05,"electrified");
		System.out.println("location: "+location+" noofstaff: "+noofstaff);
	}
}
public class ConstChainingMetrocity {

	public static void main(String[] args) {
		
		Metrocity a1=new Metrocity(05,"electrified");
		Metrocity a2=new Metrocity("bangalore",5000);
		
	}

}
