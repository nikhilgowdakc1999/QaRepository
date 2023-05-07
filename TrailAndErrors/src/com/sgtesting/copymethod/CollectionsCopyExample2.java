package com.sgtesting.copymethod;

import java.util.*;

public class CollectionsCopyExample2 {

	public static void main(String[] args) {  
		//Create lists for source and destination      
		List<Integer> source = Arrays.asList(1,2,3,4);  
		List<Integer> dest = Arrays.asList(5,6,7,8,9,10);  
		Collections.copy(dest, source);  
		//Print the List  
		for(Integer i : dest) {  
			System.out.print(i +" ");  
		}  
	}  
}  

