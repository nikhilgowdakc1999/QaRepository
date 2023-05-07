package com.sgtesting.constructor;
class Laptop
{
	Laptop(String name)
	{
		this("bangalore",2);
		System.out.println("Laptop name: "+name);
	}
	Laptop(int amt,String type)
	{
		System.out.println("cost: "+amt+" type: "+type);
	}
	Laptop(String location,int rsize)
	{
		this(54000,"fiber");
		System.out.println("location: "+location+" ramsize: "+rsize);
	}
}
public class ConstChainingLaptop {

	public static void main(String[] args) {

		Laptop a1=new Laptop("acer");

	}

}
