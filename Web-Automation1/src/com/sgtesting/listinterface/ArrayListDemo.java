package com.sgtesting.listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListDemo {

	public static void main(String[] args) {
		/* 1.  Object a[] = addElements().toArray();

      for(int i=0;i<a.length;i++)
        {
       	 System.out.println(a[i]);
         }
		 */
		/* 2.	List<Integer> a=addElements();
		Iterator <Integer> ite=a.iterator();
		while(ite.hasNext())
		{
	       	 System.out.println(ite.next());
		}
		 */	

		//	removeElements();
		//	readElements1();
		//	readElements2();
		//	readElements3();
		    withoutGenerics();

	}

	private static List<Integer> addElements()
	{
		List<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(1,100);
		obj.add(700);
		//important step
		List<Integer>d=obj;
		System.out.println("Elements :"+d);
		List<Integer> obj1=new ArrayList<Integer>();
	    int a[]= {111,222,333};
	    for(int i=0;i<a.length;i++)
	    {
	    	obj1.add(a[i]);
	    }
		obj1.addAll(obj);

		return obj1;
	}

	private static void removeElements()
	{
		List<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		//important step
		obj=addElements();
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
		List<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}

	private static void readElements2()
	{
		List<Integer> obj=new ArrayList<Integer>();
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

	private static void readElements3()
	{
		List<Integer> obj=new ArrayList<Integer>();
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

	private static void withoutGenerics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('Y');
		obj.add(12.75);
		System.out.println("Elements :"+obj);
	}
}
