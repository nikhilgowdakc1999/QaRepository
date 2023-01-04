package com.sginstitute.javatest2;
//method to return any 3 fruits names
class Fruits
{
	String[] Fruit()
	{
		String a[]= {"apple","orange","banana"};
		return a;
	}
}
public class Test2Q6 {

	public static void main(String[] args) {

		Fruits a1=new Fruits();
       String a[]=a1.Fruit();
       for(int i=0;i<3;i++)
       {
    	   System.out.println(a[i]);
       }
	}

}
