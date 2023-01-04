package com.sgtesting.arrayspart2;
class desktop
{
	String desktopname ;
	int screensize;
	String colour;
    String bodytype;
	}
class laptop
{
	String laptopname;
	int ramsize ;
	String processor;
	int amount;
}
class mobiledevice
{
	String mobname;
	String osversion;
	int amount;
	int ramsize;
}
public class InstanceVariable2 {

	public static void main(String[] args) {
		desktop acer= new desktop();
		acer.desktopname="acer";
		acer.screensize=18;
		acer.colour="Black";
		acer.bodytype="fiber";
		System.out.println("desktopname: "+acer.desktopname);
		System.out.println("empname: "+acer.screensize);
		System.out.println("job: "+acer.colour);
		System.out.println("sal:  "+acer.bodytype);
		System.out.println("---------------------");
		laptop dell=new laptop();
		dell.laptopname="dell";
		dell.ramsize=8;
		dell.processor="i-5 12th gen";
		dell.amount=50000;
		System.out.println("laptopname: "+dell.laptopname);
		System.out.println("ramsize: "+dell.ramsize);
		System.out.println("processor: "+dell.processor);
		System.out.println("amount: "+dell.amount);
		System.out.println("----------------------");
		mobiledevice pocof1=new mobiledevice();
		pocof1.mobname="redmi pocof1";
		pocof1.osversion="android";
		pocof1.ramsize=64;
		pocof1.amount=18000;
		System.out.println("mobname: "+pocof1.mobname);
	    System.out.println("osversion: "+pocof1.osversion);
		System.out.println("ramsize: "+pocof1.ramsize);
	    System.out.println("amount: "+pocof1.amount);
	    System.out.println("----------------------");

	}

}
