package com.sgtesting.interfacedemo;
interface University2
{
	default void showAddress(String address)
	{
		System.out.println("The Address of the University :"+address);
	}
}
interface EnggCollege2
{
	default void showAddress(String address)
	{
		System.out.println("The Address of the Engineering College :"+address);
	}
}

class BMSEngg implements University2,EnggCollege2
{
	public void showAddress(String address)
	{
		System.out.println("The New Address of the College :"+address);
	}
}
public class InterfaceDemo3 {
	public static void main(String[] args) {
		BMSEngg obj1=new BMSEngg();
		obj1.showAddress("1st Stage Vijayanagar");

		University2 obj2=new BMSEngg();
		obj2.showAddress("2nd Stage Jayanagar");
		
		EnggCollege2 obj3=new BMSEngg();
		obj3.showAddress("3rd Stage JP Nagar");
	}

}
