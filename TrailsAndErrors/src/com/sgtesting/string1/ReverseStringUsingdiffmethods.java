package com.sgtesting.string1;

public class ReverseStringUsingdiffmethods {

	public static void main(String[] args) {
		TocharArray();
		charAt();
		charAt1();
		charAt2();
		substring();
		substring1();
	
	}
	private static void TocharArray()
	{
		String s1="Nikhil";
		char a[]=s1.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("====================================");
	}
	private static void charAt()
	{
		String s2="Sam";
		char a=s2.charAt(0);
		char b=s2.charAt(1);
		char c=s2.charAt(2);
		char d[]= {a,b,c};
		for(int i=d.length-1;i>=0;i--)
		{
			System.out.println(d[i]);
		}
		System.out.println("====================================");
	}
	private static void charAt1()
	{
		String s="Nikhil";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			char b=s.charAt(i);
			{
				System.out.println(b);
			}
		}
		System.out.println("=======================================");
	}
	private static void charAt2()
	{
		String s="Nikhil";
		String p="";
		for(int i=s.length()-1;i>=0;i--)
		{
			p=p+s.charAt(i);	
		}
		System.out.println(p);
		System.out.println("=======================================");
	}
	private static void substring()
	{
		String s3="vini";
		//important step
		String a=s3.substring(0,1);
		String b=s3.substring(1,2); 
		String c=s3.substring(2,3);
		String d=s3.substring(3,4);
		String e[]= {a,b,c,d};
		for(int i=e.length-1;i>=0;i--)
		{
			System.out.println(e[i].toString());
		}
		
		System.out.println("=====================================");
	}
	private static void substring1()
	{
		String s="Nikhil";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			//important step
			String s1=s.substring(i,i+1);
			System.out.print(s1);
		}
		
	}  
	
}
