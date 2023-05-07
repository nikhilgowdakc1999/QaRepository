package com.sgtesting.stringtrails;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateCharacters1 {

	public static void main(String[] args)
	{
		String s="engineering";
		char a[]=s.toCharArray();
		HashSet <Character> hash=new HashSet<Character>();
		List <Character> list=new ArrayList <Character>();
		for(int i=0;i<a.length;i++)
		{
			hash.add(a[i]);
			list.add(a[i]);
		}
		Object d[]=hash.toArray();
		System.out.println(hash);
		System.out.println(list);
		
		int count=0;
		for(int i=0;i<d.length;i++)
		{   int rep=0;
			for(int k=0;k<list.size();k++)
			{
				if(list.get(k)==d[i])
				{
					count++;
					rep++;
				}
			}
			// the array in the outer loop must be provided for print
			if(count>=1) {
			System.out.println("duplicate character: "+d[i]+" , repetition: "+rep); 
			}
		}
	}
}


