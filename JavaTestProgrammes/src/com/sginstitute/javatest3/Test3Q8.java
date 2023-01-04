package com.sginstitute.javatest3;
//Parameterized constructor within instance block of 
class Maths5
{
	{
	//important step
		Maths6 a1=new Maths6(6);
		System.out.println("it is instance block 1");
	}
}
class Maths6
{
	Maths6(int x)
	{	
		System.out.println(x);
	}
}
public class Test3Q8 {

	public static void main(String[] args) {

		Maths5 b1=new Maths5();
	}

}
