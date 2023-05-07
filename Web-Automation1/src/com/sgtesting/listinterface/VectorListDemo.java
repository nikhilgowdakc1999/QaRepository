package com.sgtesting.listinterface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorListDemo {

	public static void main(String[] args) {
	
    	//	addElements();
		//	removeElements();
		//	readElements1();
		//	readElements2();
			readElementsIterator();
		//	readElementsEnumeration();
		//	withoutGenerics();
	}
	private static void addElements()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(1,100);
		obj.add(700);
		System.out.println("Elements :"+obj);
		Vector<Integer> obj1=new Vector<Integer>();
		obj1.add(111);
		obj1.add(222);
		obj1.add(333);
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(1,100);
		obj.add(700);
		System.out.println("Elements :"+obj);
		obj.remove(2);
		System.out.println("Elements :"+obj);
		obj.remove(Integer.valueOf(100));
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		for(int i:obj)
		{
			System.out.println(i);
		}
	}
	
	private static void readElements2()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElementsIterator()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void readElementsEnumeration()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		Enumeration<Integer> ite=obj.elements();
		while(ite.hasMoreElements())
		{
			System.out.println(ite.nextElement());
		}
	}
	
	private static void withoutGenerics()
	{
		Vector obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('Y');
		obj.add(12.75);
		System.out.println("Elements :"+obj);
	}
}
