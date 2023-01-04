package com.sgtesting.parameterisedconstructor;
class country
{
	String name ;
	String continent;
	String language;
	String president;
	country(String n,String c,String l,String p)
	{
	    name=n;
		continent=c;
		language=l;
		president=p;
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
	state(String n,String p,String l,String CM)
	{
		name=n;
		place=p;
		language=l;
		cm=CM;
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
	distirct(String n,String p,String l,String MP )
	{
		name=n;
		place=p;
		language=l;
		mp=MP;
		System.out.println("name: "+name);
	    System.out.println("place: "+place);
		System.out.println("language: "+language);
	    System.out.println("mp: "+mp);
	    System.out.println("----------------------");	
	}
}
public class InstanceVariable6 {

	public static void main(String[] args) {
		
		country a1= new country("india","asia","hindi","draupadi murmu");
	
		state b1=new state("Karnataka","india","hindi","bommai");
		
		 distirct c1=new distirct("tumkur","karnataka","kannada","basavaraju");
		
		 distirct c2=new distirct("bellary","karnataka","kannada","sriramulu");
		 
	     country a2= new country("srilanka","asia","simhalese"," samarth rajapaksa");
			
		state b2=new state("ap","india","telugu","jaganmohan");
	}

}
