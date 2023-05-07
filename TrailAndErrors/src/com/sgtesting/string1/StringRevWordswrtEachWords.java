package com.sgtesting.string1;

public class StringRevWordswrtEachWords {

	public static void main(String[] args) {

		ReverseEachWords1();
		ReverseEachWords2();
		ReverseEachWords3();

	}
	private static void ReverseEachWords1()
	{
		StringBuffer s=new StringBuffer("The Temple is at the top of the hill");
		StringBuffer s1=s.reverse();
		System.out.println(s1);
		System.out.println("==================================================");
	}

	private static void ReverseEachWords2()
	{
		String s="The Temple is at the top of the hill";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("                                              ");

	}
	private static void ReverseEachWords3()
	{
		String s="The Temple is at the top of the hill";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			StringBuffer s1=new StringBuffer(a[i]);
			StringBuffer s2=s1.reverse();
			System.out.print(s2+" ");
		}
	}

}

