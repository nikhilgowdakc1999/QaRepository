package com.sgtesting.outerinnerclass;

class Outer
{
	String cityname;
	Inner a=new Inner();
	void display1()
	{
		a.pincode=572102;
		System.out.println(a.pincode);
	}
	class Inner
	{
		int pincode;
		void display2()
		{
			cityname="tumkur";
			System.out.println(cityname);
		}
	}
}
public class OuterandInner {

	public static void main(String[] args) {
		Outer b=new Outer();
	    b.display1();
	    b.a.display2();
	  
	   

	}

}
