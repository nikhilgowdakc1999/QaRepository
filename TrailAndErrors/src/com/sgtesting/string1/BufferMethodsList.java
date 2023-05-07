package com.sgtesting.string1;

public class BufferMethodsList {

	public static void main(String[] args) {

		appendDemo();
		insertDemo();
		deleteDemo();
		reverseStr();
	}

	private static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("===============================================");
	}

	private static void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a book");
		StringBuffer s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("================================================");
	}

	private static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new book");
		StringBuffer s1=s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("=================================================");
	}

	private static void reverseStr()
	{
		String p="xyz";
		StringBuffer s=new StringBuffer(p);
		StringBuffer s1=s.reverse();
		System.out.println("Reverse String :"+s1);
		System.out.println("===================================================");
	}
}


