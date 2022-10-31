package com.sgtesting.wrapperclasses;

public class Unboxing {

	public static void main(String[] args) {
		Integer a=Integer.valueOf(125);
		System.out.println("Integer a :"+a);
		//Convert into primitive type
		int b=a.intValue();
		System.out.println("int b:"+b);
		//Unboxing
		int c=a;
		System.out.println("int c:"+c);

	}

}
