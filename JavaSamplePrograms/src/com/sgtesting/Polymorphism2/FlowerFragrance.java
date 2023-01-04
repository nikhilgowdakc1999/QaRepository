package com.sgtesting.Polymorphism2;
abstract class Flowerfragrance2
{
	abstract void fragrance();
}
class Lilly extends Flowerfragrance2
{
	void fragrance()
	{
		System.out.println("Lilly Fragrance:Sweet");
	}
}
class Marigold extends Flowerfragrance2
{
	void fragrance()
	{
		System.out.println("Marigold Fragrance:Pungent");
	}
}
class Jasmine extends Flowerfragrance2
{
	void fragrance()
	{
		System.out.println("Jasmine Fragrance:Minty");
	}
}
public class FlowerFragrance {

	public static void main(String[] args) {
		Flowerfragrance2 frag=null;
		
		frag=new Lilly();
		frag.fragrance();
		
		frag=new Marigold();
		frag.fragrance();
		
		frag=new Jasmine();
		frag.fragrance();
		
		

	}

}
