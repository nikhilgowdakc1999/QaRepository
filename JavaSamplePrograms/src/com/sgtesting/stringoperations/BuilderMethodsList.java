package com.sgtesting.stringoperations;

public class BuilderMethodsList {

	public static void main(String[] args) {

		appendDemo();
		insertDemo();
		deleteDemo();
		reverseStr();
	}

	private static void appendDemo()
	{
		StringBuilder s=new StringBuilder("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("=================================================");
	}

	private static void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a book");
		StringBuilder s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("==================================================");
	}

	private static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new book");
		StringBuilder s1=s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("====================================================");
	}

	private static void reverseStr()
	{
		StringBuilder s=new StringBuilder("xyz");
		StringBuilder s1=s.reverse();
		System.out.println("Reverse String :"+s1);
		System.out.println("=====================================================");
	}
}


