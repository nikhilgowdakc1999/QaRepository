package com.sgtesting.arrayspart2;
class animals
{
	String name;
	String colour;
	String type ;
	int nooflegs;
	}
class fruits
{
	String name;
	String colour;
	String vitamin;
	String shape;
}
class vegetables
{
	String name;
	String colour;
	String shape;
	String vitamin;
}

public class InstanceVariable4 {

	public static void main(String[] args) {
		
		    animals a= new animals();
			a.name="lion";
			a.colour="yellowish";
			a.type="carnivores";
			a.nooflegs=4;
			System.out.println("name: "+a.name);
			System.out.println("colour: "+a.colour);
			System.out.println("type: "+a.type);
			System.out.println("nooflegs:  "+a.nooflegs);
			System.out.println("---------------------");
			fruits b=new fruits();
			b.name="orange";
			b.colour="orange";
			b.shape="round";
			b.vitamin="c";
			System.out.println("name: "+b.name);
			System.out.println("colour: "+b.colour);
			System.out.println("shape: "+b.shape);
			System.out.println("vitamin: "+b.vitamin);
			System.out.println("----------------------");
			vegetables c=new vegetables();
			c.name="carrot";
		    c.colour="orange";
			c.shape="cone";
			c.vitamin="a";
			System.out.println("name: "+c.name);
		    System.out.println("colour: "+c.colour);
			System.out.println("shape: "+c.shape);
		    System.out.println("vitamin: "+c.vitamin);
		    System.out.println("----------------------");


	}

}
