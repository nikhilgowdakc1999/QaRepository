package com.sginstitute.javatest3;
//execute 1 inst method within another inst method of same class
class Maths
{
	void A1()
	{
		System.out.println("it is inst method1");
	}
	void B1()
	{
		A1();
		System.out.println("it is inst method2");
	}
}
	public class Test3Q4 {

		public static void main(String[] args) {
			Maths a1=new Maths();
			a1.B1();
		}

	}
