package com.sgtesting.parameterisedconstructor;
class animals
{
	String name;
	String colour;
	String type ;
	int nooflegs;
	animals(String n,String c,String t,int nol )
	{
		name=n;
		colour=c;
		type=t;
		nooflegs=nol;
		System.out.println("name: "+name);
		System.out.println("colour: "+colour);
		System.out.println("type: "+type);
		System.out.println("nooflegs:  "+nooflegs);
		System.out.println("---------------------");	
	}
	}
class fruits
{
	String name;
	String colour;
	String vitamin;
	String shape;
	fruits(String n,String c,String v,String s)
	{
		name=n;
		colour=c;
		shape=v;
		vitamin=s;
		System.out.println("name: "+name);
		System.out.println("colour: "+colour);
		System.out.println("shape: "+shape);
		System.out.println("vitamin: "+vitamin);
		System.out.println("----------------------");	
	}
}
class vegetables
{
	String name;
	String colour;
	String shape;
	String vitamin;
	vegetables(String n,String c,String s,String v)
	{
		name=n;
	    colour=c;
		shape=s;
	    vitamin=v;
		System.out.println("name: "+name);
	    System.out.println("colour: "+colour);
		System.out.println("shape: "+shape);
	    System.out.println("vitamin: "+vitamin);
	    System.out.println("----------------------");	
	}
}

public class InstanceVariable4 {

	public static void main(String[] args) {
		
		    animals a1= new animals("lion","yellow","carnivores",4);
			
			fruits b1=new fruits("apple","red","c","round");
			
			vegetables c1=new vegetables("Carrot","orange","cone","a");
			 
			 animals a2= new animals("tiger","yellow","carnivores",4);
				
				fruits b2=new fruits("banana","yellow","k","cylindrical");
				
				vegetables c2=new vegetables("beetroot","red","round","b");


	}

}
