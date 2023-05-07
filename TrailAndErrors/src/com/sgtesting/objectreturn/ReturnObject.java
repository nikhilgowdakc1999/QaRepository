package com.sgtesting.objectreturn;

//program to return an object 

class niki
{
	niki()
	{
		System.out.println("hello");
	}
	niki display(niki a)
	{
		return a;
	}
}
public class ReturnObject {

	public static void main(String[] args) {
		
		   niki s=new niki();
	       s.display(s);
	}
}
