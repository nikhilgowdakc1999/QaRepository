package com.sgtesting.noargsconstructor;
class desktop
{
	String desktopname ;
	int screensize;
	String colour;
    String bodytype;
    desktop()
    {
    	desktopname="acer";
		screensize=18;
		colour="Black";
		bodytype="fiber";
		System.out.println("desktopname: "+desktopname);
		System.out.println("empname: "+screensize);
		System.out.println("job: "+colour);
		System.out.println("sal:  "+bodytype);
		System.out.println("---------------------");
    }
	}
class laptop
{
	String laptopname;
	int ramsize ;
	String processor;
	int amount;
	laptop()
	{
		laptopname="dell";
		ramsize=8;
		processor="i-5 12th gen";
		amount=50000;
		System.out.println("laptopname: "+laptopname);
		System.out.println("ramsize: "+ramsize);
		System.out.println("processor: "+processor);
		System.out.println("amount: "+amount);
		System.out.println("----------------------");	
	}
}
class mobiledevice
{
	String mobname;
	String osversion;
	int amount;
	int ramsize;
	mobiledevice()
	{
		mobname="redmi pocof1";
		osversion="android";
		ramsize=64;
		amount=18000;
		System.out.println("mobname: "+mobname);
	    System.out.println("osversion: "+osversion);
		System.out.println("ramsize: "+ramsize);
	    System.out.println("amount: "+amount);
	    System.out.println("----------------------");

	}
}
public class InstanceVariable2 {

	public static void main(String[] args) {
		desktop acer= new desktop();
		
		laptop dell=new laptop();
		
		mobiledevice pocof1=new mobiledevice();
		
	}

}
