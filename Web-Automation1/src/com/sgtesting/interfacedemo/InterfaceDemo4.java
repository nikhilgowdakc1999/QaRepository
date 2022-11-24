package com.sgtesting.interfacedemo;
interface University4
{
	static void showAddress(String address)
	{
		System.out.println("The Address of the University :"+address);
	}
}
interface EnggCollege4
{
	static void showAddress(String address)
	{
		System.out.println("The Address of the Engineering College :"+address);
	}
}

class RVEngg implements University4,EnggCollege4
{
	
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		University4.showAddress("1st Stage Jayanagar");
		EnggCollege4.showAddress("2nd Stage JP Nagar");
	}

}
