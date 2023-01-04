package com.sgtesting.noargsconstructor;
class animals
{
	String name;
	String colour;
	String type ;
	int nooflegs;
	animals()
	{
		name="lion";
		colour="yellowish";
		type="carnivores";
		nooflegs=4;
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
	fruits()
	{
		name="orange";
		colour="orange";
		shape="round";
		vitamin="c";
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
	vegetables()
	{
		name="carrot";
	    colour="orange";
		shape="cone";
	    vitamin="a";
		System.out.println("name: "+name);
	    System.out.println("colour: "+colour);
		System.out.println("shape: "+shape);
	    System.out.println("vitamin: "+vitamin);
	    System.out.println("----------------------");	
	}
}

public class InstanceVariable4 {

	public static void main(String[] args) {
		
		    animals a= new animals();
			
			fruits b=new fruits();
			
			vegetables c=new vegetables();
			


	}

}
