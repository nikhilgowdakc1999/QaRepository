package com.sgtesting.arrayspart2;
class country
{
	String name ;
	String continent;
	String language;
	String president;
	}
class state
{
	String name;
	String place;
	String language;
	String cm;
	
}
class distirct
{
	String name;
	String place ;
	String language;
	String mp;
}
public class InstanceVariable6 {

	public static void main(String[] args) {
		
		country a= new country();
		a.name="india";
		a.continent="asia";
		a.language="hindi";
		a.president="draupadi murmu";
		System.out.println("name: "+a.name);
		System.out.println("continent: "+a.continent);
		System.out.println("language: "+a.language);
		System.out.println("president:  "+a.president);
		System.out.println("---------------------");
		state b=new state();
		b.name="karanataka";
		b.place="India";
		b.language="kannada";
		b.cm="bommai";
		System.out.println("name: "+b.name);
		System.out.println("place: "+b.place);
		System.out.println("language: "+b.language);
		System.out.println("cm: "+b.cm);
		System.out.println("----------------------");
		 distirct c=new distirct();
		c.name="tumkur";
		c.place="karnataka";
		c.language="kannada";
		c.mp="basavaraju";
		System.out.println("name: "+c.name);
	    System.out.println("place: "+c.place);
		System.out.println("language: "+c.language);
	    System.out.println("mp: "+c.mp);
	    System.out.println("----------------------");

	}

}
