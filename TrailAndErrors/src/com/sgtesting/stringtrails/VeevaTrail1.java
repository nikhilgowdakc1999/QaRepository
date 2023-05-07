package com.sgtesting.stringtrails;
// "My name Is ANil" if 1st letter is capital,convert to Lowercase and viceversa & rest all into Lowercase
public class VeevaTrail1 {

	public static void main(String[] args) {
		sample1();
			
	}
	private static void sample1()
	{
		String s="My name Is ANil";
		String x="";
		String[] s1=s.split(" ");
		for (int i=0;i<s1.length;i++)
		{
			char ch=s1[i].charAt(0);
			if(Character.isLowerCase(ch))
			{
				x=x+Character.toUpperCase(ch);
			}
			else
			{
				x=x+Character.toLowerCase(ch);
			}
			for(int k=1;k<s1[i].length();k++)
			{
				char c=s1[i].charAt(k);
				x=x+Character.toLowerCase(c);	
			}
		}
		System.out.println(x);
	}
	
}

