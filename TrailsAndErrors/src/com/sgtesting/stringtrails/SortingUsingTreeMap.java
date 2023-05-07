package com.sgtesting.stringtrails;

import java.util.*;

public class SortingUsingTreeMap {

	public static void main(String[] args) {
		//implementation of HashMap  
		HashMap<Integer, String> hm=new HashMap<Integer, String>();  
		//addding keys and values to HashMap  
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
        Set <Integer> Key1=hm.keySet();
        System.out.println("Before Sorting");
        for(int a:Key1)
        {
        	System.out.println(a+"--> "+hm.get(a));
        }
        System.out.println("=======================================");
        
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>(hm);
        Set <Integer> Key2=tm.keySet();
        System.out.println("After Sorting");
        for(int a:Key2)
        {
        	System.out.println(a+"--> "+tm.get(a));
        }
	}

}
