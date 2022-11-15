package com.sgtesting.reflection1;

public class StringOperations2 {

	public static void main(String[] args) {
		String s="NikhiL";
		String a[]=s.split("");
		System.out.print(a[a.length-1].toLowerCase()+" ");
		for(int i=a.length-2;i>=1;i--)
		{
		System.out.print(a[i].toUpperCase()+" ");
		}
		System.out.print(a[0].toLowerCase()+" "); 
	}
}
