package com.sgtesting.constructiveoverloading;
class Library
{
	Library(String name)
	{
		System.out.println("Library name: "+name);
	}
	Library(int no,String type)
	{
		System.out.println("room no: "+no+" type: "+type);
	}
	Library(String location,int noofbooks)
	{
		System.out.println("location: "+location+" noofbooks: "+noofbooks);
	}
}
public class ConstOverloadingLibrary {

	public static void main(String[] args) {

		Library a1=new Library(01,"Digital");
		Library a2=new Library("civil");
		Library a3=new Library("jb campus",50000);
	}

}
