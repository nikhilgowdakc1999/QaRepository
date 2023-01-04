package com.sgtesting.P2;
import com.sgtesting.P1.Protection;
public class IndependentClassInP2Package {
	Protection a=new Protection();
	public IndependentClassInP2Package()
	{
		System.out.println("It is an IndependentClassInP2Package class Constructor");
		//System.out.println("private_a: "+a.Private_a);
	    //System.out.println("default_b: "+a.default_b);
		//System.out.println("protected_c "+a.protected_d);
	    System.out.println("public_d: "+a.public_d); 
	}
	public static void main(String[] args) {
		

	}

}
