package com.sgtesting.generics;
class MyGeneric<T>
{
	private T obj=null;
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		//With Generics Approach
				MyGeneric<String> obj1=new MyGeneric<String>();
				obj1.add("Mango");
				
				String s1=obj1.get();
				System.out.println(s1);
				
				
				//Without Generics Approach
				MyGeneric obj2=new MyGeneric();
				obj2.add("Apple");
				String s2= (String) obj2.get();
				System.out.println(s2);
				obj2.add(125);
				int a=(int) obj2.get();
				System.out.println(a);
			}

	}


