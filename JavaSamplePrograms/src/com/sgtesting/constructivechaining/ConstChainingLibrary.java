package com.sgtesting.constructivechaining;
class Library
{
	Library(String name)
	{
		System.out.println("Library name: "+name);
	}
	Library(int no,String type)
	{
		this("Civil");
		System.out.println("room no: "+no+" type: "+type);
	}
	Library(String location,int noofbooks)
	{
		this(01,"digital");
		System.out.println("location: "+location+" noofbooks: "+noofbooks);
	}
}
public class ConstChainingLibrary {

	public static void main(String[] args) {
		
		Library a1=new Library("civil");	
		Library a2=new Library(01,"digital");

	}

}
