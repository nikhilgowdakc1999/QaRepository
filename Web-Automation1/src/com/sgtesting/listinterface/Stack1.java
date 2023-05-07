package com.sgtesting.listinterface;

import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		PushReadAndPop();

	}
	private static void PushReadAndPop()
	{
		Stack <Integer> st=new Stack<Integer>();
		System.out.println(st);
		st.push(100);
		st.push(300);
		st.push(200);
		st.push(500);
		System.out.println(st);
		//Read using for-each loop
		for(int a:st)
		{
			System.out.println(a);
		}
		System.out.println("======================================");
		Iterator <Integer> ite=st.iterator();
		while(ite.hasNext())
		{
		System.out.println(ite.next());	
		}
		System.out.println("=======================================");
		ListIterator <Integer> listite=st.listIterator();
		while(listite.hasNext())
		{
		System.out.println(listite.next());	
		}
		System.out.println("=======================================");
		st.pop();
		st.pop();
		System.out.println(st);
	}
}
