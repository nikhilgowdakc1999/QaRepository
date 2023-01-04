package com.sgtesting.noargsconstructor;
class twowheeler
{
	String bikename;
	int bikecc;
	String bikeowner;
	int cost;
	twowheeler()
	{
		bikename="splendorplus";
		bikeowner="Arvind";
		bikecc=250;
		cost=80000;
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
	fourwheeler()
	{
		carname="fortuner";
		carowner="Ram";
		milage=35;
		cost=1400000;
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
	heavyvehicles()
	{
		truckname="ashokaleyland";
		truckholdername="Anand";
		milage=40;
		cost=5000000;
		System.out.println("truckname: "+truckname);
	    System.out.println("truckholdernme: "+truckholdername);
		System.out.println("milage: "+milage);
	    System.out.println("cost: "+cost);
	    System.out.println("----------------------");	
	}
}
public class InstanceVariable3 {

	public static void main(String[] args) {
		twowheeler a= new twowheeler ();
		
		fourwheeler b=new fourwheeler();
		
		heavyvehicles c=new heavyvehicles();
		
	}

}
