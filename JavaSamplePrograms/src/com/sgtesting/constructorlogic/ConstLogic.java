package com.sgtesting.constructorlogic;
class Demo1
{
	Demo1(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	Demo1(int x,int y)
	{
		int res=x+y;
		System.out.println("addition result: "+res);
	}
}
public class ConstLogic {

	public static void main(String[] args) {
        int arr[]= {1,2,3,45};
		Demo1 a1=new Demo1(arr);
        Demo1 a2=new Demo1(1,4);
	}

}
