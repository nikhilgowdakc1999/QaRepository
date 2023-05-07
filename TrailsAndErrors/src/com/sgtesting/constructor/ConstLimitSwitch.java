package com.sgtesting.constructor;
class Maths
{
	Maths(int x,int y,String action)
	{
		int res;
		switch(action)
		{
		case "add":
			res=(x+y);
			System.out.println("addition Result: "+res);
			break;
		case "sub":
			res=(x-y);
			System.out.println("subtraction Result: "+res);
			break;
		case "multi":
			res=(x*y);
			System.out.println("multiplication Result: "+res);
			break;
		case "div":
			res=(x/y);
			System.out.println("division Result: "+res);
			break;
		case "modu":
			res=(x%y);
			System.out.println("Modulus Result: "+res);
			break;
		default:
			System.out.println("invalid Action!!");
		}
	}
}
public class ConstLimitSwitch {

	public static void main(String[] args) {

		Maths a1=new Maths(10,20,"add");
		Maths a2=new Maths(10,10,"sub");
		Maths a3=new Maths(10,2,"multi");
		Maths a4=new Maths(100,10,"div");
		Maths a5=new Maths(12,10,"modu");

	}

}
