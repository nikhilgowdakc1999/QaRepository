package com.sgtesting.callby;
class Demo1
{
	Demo1(String name)
	{
		System.out.println("name:"+name);
	}
	{
		System.out.println("instance body2");
	}
	static
	{
		System.out.println("instance body1");
	}
	
}
public class InstanceBlock {

	public static void main(String[] args) {
		
		Demo1 a1=new Demo1("niki");
	}

}
