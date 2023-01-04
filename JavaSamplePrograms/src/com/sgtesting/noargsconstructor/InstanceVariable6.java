package com.sgtesting.noargsconstructor;
class country
{
	String name ;
	String continent;
	String language;
	String president;
	country()
	{
	    name="india";
		continent="asia";
		language="hindi";
		president="draupadi murmu";
		System.out.println("name: "+name);
		System.out.println("continent: "+continent);
		System.out.println("language: "+language);
		System.out.println("president:  "+president);
		System.out.println("---------------------");	
	}
	}
class state
{
	String name;
	String place;
	String language;
	String cm;
	state()
	{
		name="karanataka";
		place="India";
		language="kannada";
		cm="bommai";
		System.out.println("name: "+name);
		System.out.println("place: "+place);
		System.out.println("language: "+language);
		System.out.println("cm: "+cm);
		System.out.println("----------------------");	
	}
	
}
class distirct
{
	String name;
	String place ;
	String language;
	String mp;
	distirct()
	{
		name="tumkur";
		place="karnataka";
		language="kannada";
		mp="basavaraju";
		System.out.println("name: "+name);
	    System.out.println("place: "+place);
		System.out.println("language: "+language);
	    System.out.println("mp: "+mp);
	    System.out.println("----------------------");	
	}
}
public class InstanceVariable6 {

	public static void main(String[] args) {
		
		country a= new country();
	
		state b=new state();
		
		 distirct c=new distirct();
		

	}

}
