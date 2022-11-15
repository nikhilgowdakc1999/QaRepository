package com.sgtesting.stringtrails;

public class AlternateCharUppercase {

	public static void main(String[] args) {
		String s="nikhil";
		String a[] = s.split("");
        for(int i=0;i<a.length;i++)
        {
        	if(i%2==0)
        	{
        		System.out.print(a[i].toUpperCase()+" ");
        	}
        	else
        	{
        		System.out.print(a[i].toLowerCase()+" ");
        	}
        }
	}

}
