package com.sginstitute.javatest4;
//return object
class sample
{

	static sample getinstance()
	{
		//important step
		return new sample();		
	}
}

public class Test4Q6 {

	public static void main(String[] args) {

		sample z=sample.getinstance();
		System.out.println(z);
	}
}
