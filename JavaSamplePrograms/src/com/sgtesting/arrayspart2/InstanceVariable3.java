package com.sgtesting.arrayspart2;
class twowheeler
{
	String bikename;
	int bikecc;
	String bikeowner;
	int cost;
	}
class fourwheeler
{
	String carname;
	String carowner;
	int milage;
	int cost;
}
class heavyvehicles{
	String truckname;
	int cost;
	String truckholdername;
	int milage;
}
public class InstanceVariable3 {

	public static void main(String[] args) {
		twowheeler a= new twowheeler ();
		a.bikename="splendorplus";
		a.bikeowner="Arvind";
		a.bikecc=250;
		a.cost=80000;
		System.out.println("bikename: "+a.bikename);
		System.out.println("bikeowner: "+a.bikeowner);
		System.out.println("bikecc: "+a.bikecc);
		System.out.println("cost:  "+a.cost);
		System.out.println("---------------------");
		fourwheeler b=new fourwheeler();
		b.carname="fortuner";
		b.carowner="Ram";
		b.milage=35;
		b.cost=1400000;
		System.out.println("carname: "+b.carname);
		System.out.println("carowner: "+b.carowner);
		System.out.println("milage: "+b.milage);
		System.out.println("cost: "+b.cost);
		System.out.println("----------------------");
		heavyvehicles c=new heavyvehicles();
		c.truckname="ashokaleyland";
		c.truckholdername="Anand";
		c.milage=40;
		c.cost=5000000;
		System.out.println("truckname: "+c.truckname);
	    System.out.println("truckholdernme: "+c.truckholdername);
		System.out.println("milage: "+c.milage);
	    System.out.println("cost: "+c.cost);
	    System.out.println("----------------------");
	}

}
