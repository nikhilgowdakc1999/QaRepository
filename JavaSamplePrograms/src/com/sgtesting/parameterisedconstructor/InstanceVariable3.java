package com.sgtesting.parameterisedconstructor;
class twowheeler
{
	String bikename;
	int bikecc;
	String bikeowner;
	int cost;
	twowheeler(String bname,int bcc,String bo,int c)
	{
		bikename=bname;
		bikeowner=bo;
		bikecc=bcc;
		cost=c;
		System.out.println("bikename: "+bikename);
		System.out.println("bikeowner: "+bikeowner);
		System.out.println("bikecc: "+bikecc);
		System.out.println("cost:  "+cost);
		System.out.println("---------------------");	
	}
	}
class fourwheeler
{
	String carname;
	String carowner;
	int milage;
	int cost;
	fourwheeler(String cname,String co,int m,int c)
	{
		carname=cname;
		carowner=co;
		milage=m;
		cost=c;
		System.out.println("carname: "+carname);
		System.out.println("carowner: "+carowner);
		System.out.println("milage: "+milage);
		System.out.println("cost: "+cost);
		System.out.println("----------------------");	
	}
}
class heavyvehicles{
	String truckname;
	int cost;
	String truckholdername;
	int milage;
	heavyvehicles(String tname,int c,String thname,int m)
	{
		truckname=tname;
		truckholdername=thname;
		milage=m;
		cost=c;
		System.out.println("truckname: "+truckname);
	    System.out.println("truckholdernme: "+truckholdername);
		System.out.println("milage: "+milage);
	    System.out.println("cost: "+cost);
	    System.out.println("----------------------");	
	}
}
public class InstanceVariable3 {

	public static void main(String[] args) {
		twowheeler a1= new twowheeler ("splendor",250,"niki",7800);
		
		twowheeler a2= new twowheeler ("pulsar",350,"sam",100000);
		
		fourwheeler b1=new fourwheeler("punto","vini",45,800000);
		
		fourwheeler b2=new fourwheeler("fortuner","ram",35,150000);
		
		heavyvehicles c1=new heavyvehicles("ashoka leyland",450000,"ramu",40);
		
		heavyvehicles c2=new heavyvehicles("eicher",500000,"vinay",35);
		
	}

}
