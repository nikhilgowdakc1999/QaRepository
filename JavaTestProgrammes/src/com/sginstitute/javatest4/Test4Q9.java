package com.sginstitute.javatest4;
class callByReference
{
	String x;
	String y;
	void show(callByReference a)
	{
		a.x="niki";
		a.y="sam";
		System.out.println(a.x);
		System.out.println(a.y);

	}	
}
public class Test4Q9 {

	public static void main(String[] args) {

		callByReference a1=new callByReference();
		a1.x="vini";
		a1.y="benzee";
		System.out.println(a1.x);
		System.out.println(a1.y);

		a1.show(a1);
		System.out.println(a1.x);
		System.out.println(a1.y);
	}

}
