package com.sgtesting.string1;

public class StringMethodsList {

	public static void main(String[] args) {
		//Methods list from class string 
		displayLength();
		verifyEmptyString();
		lowerCase();
		upperCase();
		replaceDemo();
		subStrDemo();
		compareString1();
		compareString2();
		existanceOfString();
		splitDemo();
		convertToCharArray();
		findPosition();
		convertToString();
		charAtDemo();

	}

	private static void displayLength()
	{
		String s=new String("Program");
		int len=s.length();
		System.out.println("# of Chars :"+len);
		System.out.println("===============================================");
	}
	
	private static void verifyEmptyString()
	{
		String s=new String("niki");
		boolean v1=s.isEmpty();
		System.out.println("Is it Empty String :"+v1);
		System.out.println("================================================");
	}
	
	private static void lowerCase()
	{
		String s="PROGRAM";
		String s1=s.toLowerCase();
		System.out.println("Lower Case :"+s1);
		System.out.println("=================================================");
	}
	
	private static void upperCase()
	{
		String s="software testing";
		String s1=s.toUpperCase();
		System.out.println("Upper Case :"+s1);
		System.out.println("==================================================");
	}
	
	private static void replaceDemo()
	{
		String s=new String("It is a new palace");
		String s1=s.replace("is","was");
		System.out.println("Repalced Result :"+s1);
		System.out.println("==================================================");
	}
	
	private static void subStrDemo()
	{
		String s="Programming";
		//First Approach [Position]
		String s1=s.substring(3);
		System.out.println("Result1 :"+s1);
		//Second Approach [range]
		String s2=s.substring(3,7);
		System.out.println("Result2 :"+s2);
		System.out.println("====================================================");
	
	}
	
	private static void compareString1()
	{
		//using s.equals(s1)
		String s1="JAVASCRIPT";
		String s2="JavaScript";
		System.out.println("s1 and s2 are equal :"+s1.equals(s2));
		System.out.println("Ignore Case Compare :"+s1.equalsIgnoreCase(s2));
		System.out.println("=====================================================");
	}
	
	private static void compareString2()
	{
		//using s.compareTo(s1)
		String s1="JAVASCRIPT";
		String s2="javascript";
		System.out.println("s1 and s2 are equal :"+s1.compareTo(s2));
		System.out.println("Ignore Case Compare :"+s1.compareToIgnoreCase(s2));
		System.out.println("=======================================================");
	}
	
	private static void existanceOfString()
	{
		String s="It is a 125th new Palace";
		System.out.println("Starts With :"+s.startsWith("It"));
		System.out.println("Ends With :"+s.endsWith("Palace"));
		System.out.println("Contains :"+s.contains("125"));
		System.out.println("========================================================");
	}
	
	private static void splitDemo()
	{
		String s="Apple,Mango,Orange";
		String s1[]=s.split(",");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("==========================================================");
	}
	
	private static void convertToCharArray()
	{
		String s="Testing";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("==========================================================");
	}
	
	private static void findPosition()
	{
		String s="It is a 10th new palace, is It?";
		int pos1=s.indexOf("is",5);
		System.out.println("Position of 'is' from left to Right :"+pos1);
		int pos2=s.lastIndexOf("i",24);
		System.out.println("Position of 'is' from right to left :"+pos2);
		System.out.println("=============================================================");
	}
	
	private static void convertToString()
	{
		char b[]= {'b','e','n','z','e','e'};
		String s3=String.valueOf(b);
		char a='b';
		String s1=String.valueOf(a);
		System.out.println("Convert int into String :"+s1);
		double d=12.75;
		String s2=String.valueOf(d);
		System.out.println("Convert double into String :"+s2);
		System.out.println("convert char[] into string: "+s3);
		System.out.println("==============================================================");
	}

	private static void charAtDemo()
	{
		String s="DEMO";
		char ch1=s.charAt(0);
		System.out.println("First Position :"+ch1);
		char ch2=s.charAt(1);
		System.out.println("Second Position :"+ch2);
		System.out.println("=================================================================");
	}
	
}


