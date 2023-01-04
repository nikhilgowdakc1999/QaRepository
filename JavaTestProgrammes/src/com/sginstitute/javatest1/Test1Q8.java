package com.sginstitute.javatest1;
//1-D double array to another array in reverse order
public class Test1Q8 {

	public static void main(String[] args) {
		double a[]= {12.6,54.8,68.4,57.6};
		double b[]= new double[a.length];

		for(int i=a.length-1;i>=0;i--) 
		{
//to insert values into another array
			 b[i]=a[i];	
			System.out.println(b[i]);
		}

	}

}
