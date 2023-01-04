package com.sgtesting.stringoperations;

public class VowelsAndConsonantsInString {

	public static void main(String[] args) {
		VowelsInString();
		ConsonentsInString();
		VowelsAndConsonents();
	}
	private static void VowelsInString()
	{
		String s="Programme";
		char c[]=s.toCharArray();
		char d[]= {'a','e','i','o','u'};
		int count=0;
		for(int k=0;k<c.length;k++)
		{
			for(int g=0;g<d.length;g++)
			{
				if(c[k]==d[g])
				{
					System.out.println(c[k]);
					count++;
				}
			}
		}System.out.println(count);

		System.out.println("=========================================");
	}

	private static void ConsonentsInString()
	{
		String s="Programme";
		char c[]=s.toCharArray();
		char d[]= {'a','e','i','o','u'};
		int count=0;
		for(int k=0;k<c.length;k++)
		{
			for(int g=0;g<d.length;g++)
			{
				if(c[k]==d[g])
				{
					count++;
				}
			}
		}System.out.println(c.length-count);
		System.out.println("===================================");
	}
	private static void VowelsAndConsonents()
	{
		String s="programme";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			//important step
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')	
			{
				System.out.println(c[i]+" is a vowel");
			}
			else
			{
				//important step
				System.out.println(c[i]+" is not a vowel");
			}
		}
	}

}
