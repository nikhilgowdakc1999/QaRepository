package com.sgtesting.stringtrails;

//Java program for finding duplicates using HashMap
import java.util.*;
public class DuplicateCharacters2 {

	// Function to print all duplicate
	// characters in string using HashMap
	public static void
	countDuplicateCharacters(String str)
	{

		// Creating a HashMap containing char
		// as a key and occurrences as a value
		Map<Character, Integer> map
		= new HashMap<Character, Integer>();

		// Converting given string into
		// a char array
		char charArray[] = str.toCharArray();

		// Checking each character
		// of charArray
		for (char c : charArray)
		{
			if (map.containsKey(c))
			{
				// If character is present
				// in map incrementing it's
				// count by 1
				map.put(c, map.get(c) + 1);
			}
			else 
			{
				// If character is not present
				// in map putting this
				// character into map with
				// 1 as it's value.
				map.put(c, 1);
			}
		}

		// Traverse the HashMap, check
		// if the count of the character
		// is greater than 1 then print
		// the character and its frequency
		Set<Character> keys=map.keySet(); 
		for (char ch:keys)
		{
			System.out.println(ch+"-->"+map.get(ch));
		}

	}

	// Driver Code
	public static void main(String args[])
	{
		// Given String str
		String str = "geeks for geeks";

		// Function Call
		countDuplicateCharacters(str);
	}
}
