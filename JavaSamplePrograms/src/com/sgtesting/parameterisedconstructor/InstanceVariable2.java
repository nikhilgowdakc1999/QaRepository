package com.sgtesting.parameterisedconstructor;
class desktop
{
	String desktopname ;
	int screensize;
	String colour;
    String bodytype;
    desktop(String dname,int sSize,String c,String bt)
    {
    	desktopname=dname;
		screensize=sSize;
		colour=c;
		bodytype=bt;
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
	laptop(String lname, int rsize,String p,int a)
	{
		laptopname=lname;
		ramsize=rsize;
		processor=p;
		amount=a;
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
	mobiledevice(String mname,String osv,int a,int rsize)
	{
		mobname=mname;
		osversion=osv;
		ramsize=rsize;
		amount=a;
		System.out.println("mobname: "+mobname);
	    System.out.println("osversion: "+osversion);
		System.out.println("ramsize: "+ramsize);
	    System.out.println("amount: "+amount);
	    System.out.println("----------------------");

	}
}
public class InstanceVariable2 {

	public static void main(String[] args) {
		desktop a1= new desktop("philips",8,"balck","fiber");
		
		desktop a2= new desktop("lg",7,"white","metallic");
		
		laptop b1=new laptop("acer",8,"i-5",45000);
		
		laptop b2=new laptop("lenovo",16,"i-7",58000);
		
		mobiledevice c1=new mobiledevice("pocof1","android",18000,64);
		
		mobiledevice c2=new mobiledevice("samsung s1","android",21000,16);
		
		
	}

}
