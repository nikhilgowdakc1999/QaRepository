package com.sgtesting.interfacedemo;
interface University1
{
	void showUniversityName(String name);
	static void showAddress(String address)
	{
		System.out.println("The Address of the University :"+address);
	}
}
class SLNEngg1 implements University1
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		SLNEngg1 obj=new SLNEngg1();
		obj.showUniversityName("VTU");
	//	University1.showAddress("4th Block Jayanagar Belguam");
	}

}
