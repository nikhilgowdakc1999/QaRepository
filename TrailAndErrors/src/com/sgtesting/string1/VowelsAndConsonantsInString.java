package com.sgtesting.string1;

public class VowelsAndConsonantsInString {

	public static void main(String[] args) {
	//	VowelsInString();
	//	ConsonentsInString();
	//	VowelsAndConsonents();
		VowelsAndConsonentsChatAt();
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
		}System.out.println("NO of vowels: "+count);

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
		}System.out.println("No of Consonents: "+(c.length-count));
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
				System.out.println(c[i]+" is  a Consonent");
			}
		}
	}
	public static void VowelsAndConsonentsChatAt()
	{
		String a="NikhilGowdaKc";
		for (int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+" is a vowel");
			}
			else
			{
				System.out.println(ch+" is a consonent");
			}
		}
	}

}
