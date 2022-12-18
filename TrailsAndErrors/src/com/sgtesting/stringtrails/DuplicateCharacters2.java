package com.sgtesting.stringtrails;

import java.util.HashMap;

public class DuplicateCharacters2 {

	public static void main(String[] args) {

		String str=" Programming ";
		HashMap <Character,Integer> oMap=new HashMap<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(oMap.containsKey(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
				System.out.println("1 "+oMap);
				int count=oMap.get(str.charAt(i));
				System.out.println("2 "+count);
				oMap.put(str.charAt(i),++count);
				System.out.println("3 "+oMap);
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			}
			else
			{
				oMap.put(str.charAt(i),1);
			}
		}
		System.out.println(oMap);
	}

}
