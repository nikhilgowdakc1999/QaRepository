package com.sgtesting.inheritanceTrails;
class AA2
{
	AA2()
	{
		System.out.println("it is a AA2 class Constructor");	
	}
}
class BB2 extends AA2
{
	BB2()
	{
		System.out.println("it is a BB2 class Constructor");	
	}
}
class CC2 extends AA2
{
	CC2()
	{
		System.out.println("it is a CC2 class Constructor");	
	}
}
class DD2 extends CC2
{
	DD2()
	{
		System.out.println("it is a DD2 class Constructor");
	}
}

public class Trail2HybridInheritance {

	public static void main(String[] args) {
	
		DD2 a1=new DD2();
		CC2 a2=new CC2();
	}
}
