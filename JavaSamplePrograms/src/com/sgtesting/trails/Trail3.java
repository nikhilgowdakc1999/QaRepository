package com.sgtesting.trails;
class Students35
{
	Students35(String name)
	{
		System.out.println(name);
	}
}
class College25 extends Students35
{
	College25(String name)
	{
		super(name);
	}
}
class Sports35 extends Students35
{
	Sports35()
	{
		super("vini");
	}
}
public class Trail3 {

	public static void main(String[] args) {

		College25 a2=new College25("vinayak");
		Sports35 a1=new Sports35();
	}

}
