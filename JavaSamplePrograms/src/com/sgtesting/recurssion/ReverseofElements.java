package com.sgtesting.recurssion;
class Noofele
{
	int element(int n)
	{
		int a=0;
		int rem;
	for(int i=n;i>0;i/=10)
		{
			rem=i%10;
	     //important step
			a=(a*10)+rem;
		}
		return a;
	}
}
public class ReverseofElements {

	public static void main(String[] args) {

		Noofele a1=new Noofele();
		int n=544331;
		int z=a1.element(n);
		System.out.println(z);
	}
}

