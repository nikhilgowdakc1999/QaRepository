package com.sginstitute.javatest1;
//3rd table result into 1-D integer array
public class Test1Q10 {

	public static void main(String[] args) {
		int a[]=new int [10];
		int p=0;
		for(int i=1;i<=10;i++)
		{
			int res=i*3;
			a[p]=res;
			System.out.println(a[p]);
			p++;
		}

	}

}
