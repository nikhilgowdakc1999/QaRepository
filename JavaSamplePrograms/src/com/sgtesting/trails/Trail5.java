package com.sgtesting.trails;
//Methods chaining
class Methods2
{
	void Add(int x)
	{
		System.out.println(x);
	}
	void Add()
	{
		Add(2);
		System.out.println("noargs");
	}
}
public class Trail5 {

	public static void main(String[] args) {
		Methods2 a1=new Methods2();
		a1.Add();
	}
}
