package com.sgtesting.callby;
class CBRefer
{
	int x,y;
	void refer(CBRefer a)
	{
		a.x+=100;
		a.y*=9;
		System.out.println("in method: "+a.x);
		System.out.println("in method: "+a.y);
	}
}
public class CallByRefer {

	public static void main(String[] args) {
		CBRefer a1=new CBRefer();
		a1.x=10;
		a1.y=5;
		System.out.println("before method: "+a1.x);
		System.out.println("before method: "+a1.y);
        a1.refer(a1);
        System.out.println("after method: "+a1.x);
        System.out.println("after method: "+a1.y);
	}

}
