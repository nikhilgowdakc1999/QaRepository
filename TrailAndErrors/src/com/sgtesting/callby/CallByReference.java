package com.sgtesting.callby;
class Callbyreference2
{
	String x,y;
	
	void Calculate(Callbyreference2 a) 
	{
		a.x="niki";
		a.y="sam";
		System.out.println("Method x value: "+a.x);
		System.out.println("Method y value: "+a.y);
	}

}
public class CallByReference {

	public static void main(String[] args) {

		Callbyreference2 a1=new Callbyreference2();
		a1.x="nikhil";
		a1.y="samarth";
		System.out.println("before method execution x value: "+a1.x);
		System.out.println("before method execution y value: "+a1.y);
		a1.Calculate(a1);
		System.out.println("after method execution x value: "+a1.x);
		System.out.println("after method execution y value: "+a1.y);
	}

}
