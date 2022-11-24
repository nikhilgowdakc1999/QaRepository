package com.sgtesting.scannerdemo;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the 1st no: ");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no: ");
		int b=sc.nextInt();
		int res=a+b;
		System.out.println("addition result of two nos: "+res);
        sc.close();
	}
}
