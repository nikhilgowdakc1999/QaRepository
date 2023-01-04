package com.sgtesting.abstractclass;
//abstract superclass contains only static block alone
abstract class Animals2
{
	static 
	{
		System.out.println("static block");
	}
}
//important step
class breed extends Animals2
{
	breed()
	{
		System.out.println("breed constructor");
	}
	
}
public class AbsStaticBlockalone {

	public static void main(String[] args) {
		
		breed a1=new breed();
	}

}
