package com.sgtesting.stringtrails;
// sorting by keys
import java.util.*;

public class SortByKeys {

	public static void main(String[] args) {
		Sortkeys1();
	}
	private static void Sortkeys1()
	{
		HashMap< Integer,String> map = new HashMap<>();
		LinkedHashMap<Integer,String> sortedMap = new LinkedHashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		map.put( 5,"A");
		map.put( 7,"B");
		map.put( 3,"c");
		map.put( 1,"D");
		map.put( 2,"E");
		map.put( 8,"F");
		map.put( 4,"G");
		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			list.add(entry.getKey());
		}
		Collections.sort(list); 
		for (int num : list) 
		{
			for (Map.Entry<Integer ,String> entry : map.entrySet())
			{
				if (entry.getKey().equals(num)) 
				{
					sortedMap.put(num,entry.getValue());
				}
			}
		}
		System.out.println(sortedMap);
	}

}
