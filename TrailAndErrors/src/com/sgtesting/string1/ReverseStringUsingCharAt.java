package com.sgtesting.string1;

public class ReverseStringUsingCharAt {

	public static void main(String[] args) {
		String s="mam";
		String p="";
		for(int i=s.length()-1;i>=0;i--)
		{
			p=p+s.charAt(i);
		}
		System.out.println(p);
		System.out.println(s.equals(p));
	
	}

}
