package com.sgtesting.outerinnerclass;

class out
{
	String s[]= {"apple","mango"};
	in a1=new in();
	void display1()
	{
		for(int i=0;i<a1.a.length;i++)
		{
			System.out.println(a1.a[i]);
		}
	}
	class in
	{
		int a[]= {10,20,30};
		void display2()
		{
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
		}
	}
}
public class OuterAndInner1 {

	public static void main(String[] args) {
		out b=new out();
		b.display1();
		b.a1.display2();

	}

}
