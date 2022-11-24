package com.sgtesting.interfacedemo;
interface University
{
	void showUniversityName(String name);
	default void showAddress(String address)
	{
		System.out.println("The Address of the University :"+address);
	}
}

class SLNEngg implements University
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		SLNEngg obj=new SLNEngg();
		obj.showUniversityName("VTU");
		obj.showAddress("4th Block Jayanagar Belguam");
	}

}
