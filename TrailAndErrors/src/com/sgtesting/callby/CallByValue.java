package com.sgtesting.callby;
class CallValue
{
	void Cvalue(int x,int y)
	{
		x+=100;
		y*=9;
		System.out.println("In method x:"+x);
		System.out.println("In method y:"+y);
	}
	
}
public class CallByValue {

	public static void main(String[] args) {
		int x=10;
		int y=5;
		System.out.println("before method execution x:"+x);
		System.out.println("before method execution y:"+y);
		CallValue a1=new CallValue();
		a1.Cvalue(x, y);
		System.out.println("after method execution x:"+x);
		System.out.println("after method execution x:"+y);
	}

}
