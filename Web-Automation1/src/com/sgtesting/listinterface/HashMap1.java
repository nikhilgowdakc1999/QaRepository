package com.sgtesting.listinterface;

import java.util.HashMap;
//sorting string using hashmap
public class HashMap1 {

	public static void main(String[] args) {

		HashMap <String,String> Hm=new HashMap <String,String>();
		Hm.put("Man","Nikhil");
		Hm.put("Man1","Anaconda");
		Hm.put("Man2","Zebra");	
		Hm.put("Man3","Quip");
		Hm.put("Man4","Sam");
		String s[]= {Hm.get("Man2"),Hm.get("Man"),Hm.get("Man1"),Hm.get("Man4"),Hm.get("Man3")};
		String s1[]=new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			for(int j=0;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)	
				{
					count++;
				}
			}
			s1[count]=s[i];
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
		String h="a1a2a3a4";
	String d[]=h.split("");
	int y=Integer.parseInt(d[3]);
	char b='g';
	int t=y+3;
	System.out.println(t);
	int h1='f'+4;
	
	System.out.println(h1);
	
	System.out.println(y);
		
		
	}
}
