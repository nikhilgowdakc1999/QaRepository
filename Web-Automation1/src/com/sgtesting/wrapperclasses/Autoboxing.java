package com.sgtesting.wrapperclasses;

public class Autoboxing {

	public static void main(String[] args) {
		int a=125;
		System.out.println("int a :"+a);
		//Convert it into Wrapper class object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b :"+b);
		//Autoboxing
		Integer c=a;
		System.out.println("Integer c:"+c);

	}

}
