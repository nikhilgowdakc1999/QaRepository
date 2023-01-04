package com.sgtesting.P2;
import com.sgtesting.P1.Protection;
public class SubClassInp2Package extends Protection
{
	public SubClassInp2Package()
		{
		System.out.println("It is a SubClassInp2Package class Constructor");
		//System.out.println("private_a: "+Private_a);
		//System.out.println("default_b: "+default_b);
        System.out.println("protected_c "+protected_c);
        System.out.println("public_d: "+public_d); 
	}

}
