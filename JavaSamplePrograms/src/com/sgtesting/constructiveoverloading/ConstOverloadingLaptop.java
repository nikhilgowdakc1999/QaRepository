package com.sgtesting.constructiveoverloading;
class Laptop
{
	Laptop(String name)
	{
		System.out.println("Laptop name: "+name);
	}
	Laptop(int amt,String type)
	{
		System.out.println("cost: "+amt+" type: "+type);
	}
	Laptop(String location,int rsize)
	{
		System.out.println("location: "+location+" ramsize: "+rsize);
	}
}
public class ConstOverloadingLaptop {

	public static void main(String[] args) {

		Laptop a1=new Laptop("hampinagar",8);
		Laptop a2=new Laptop("acer");
		Laptop a3=new Laptop(54000,"fiber");
	}

}
