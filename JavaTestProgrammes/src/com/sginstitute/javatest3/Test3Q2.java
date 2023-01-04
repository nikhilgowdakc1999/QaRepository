package com.sginstitute.javatest3;
//OuterStudent and InnerLibrary
class OuterStudent
{
	String Sname;
	//to access variable from inner class we use object
	innerLibrary a1=new innerLibrary();
	void showLibname()
	{
		a1.Libname="Uvce";
		System.out.println("Library name:"+a1.Libname);
	}
	class innerLibrary
	{
		String Libname;
		void showSname()
		{
			Sname="Niki";
			System.out.println("student name:"+Sname);
		}
	}
}
public class Test3Q2 {

	public static void main(String[] args) {

		OuterStudent b=new OuterStudent();
		b.showLibname();
		//important step
		b.a1.showSname();
	}
}
