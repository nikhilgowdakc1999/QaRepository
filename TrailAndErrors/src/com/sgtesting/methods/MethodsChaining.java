package com.sgtesting.methods;
//Methods chaining
class Methods2
{
	static void Add(int x)
	{
		System.out.println(x);
	}
	static void Add()
	{
		Add(2);
		System.out.println("noargs");
	}
}
public class MethodsChaining {

	public static void main(String[] args) {
		Methods2.Add();
	}
}
