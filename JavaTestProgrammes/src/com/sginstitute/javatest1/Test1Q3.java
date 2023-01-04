package com.sginstitute.javatest1;
//integer a[]= {5,10,15,20,25,30,35,40,45};
//2nd largest and 2nd smallest no
public class Test1Q3 {

	public static void main(String[] args) {		
		int a[]= {5,10,15,20,25,30,35,40,45};
		int b[]= {5,10,15,20,25,30,35,40,45};
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<=b[i])
			{
				count++;
			}
			if (count==(a.length-1))
			{
				System.out.println(a[i]);
			}
			if (count==(2))
			{
				System.out.println(a[i]);
			}
		}
	}
}
