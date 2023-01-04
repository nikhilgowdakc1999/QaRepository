package com.sginstitute.javatest4;
class ParaConst
{
	ParaConst(int x)
	{
		System.out.println(x);
	}
	static
	{
		ParaConst a1=new ParaConst(2);
	System.out.println("Static block");	
	}
	static void display()
	{
		System.out.println("Static method");
	}
}
public class Test4Q8 {

	public static void main(String[] args) {
		ParaConst.display();
		
	}

}
