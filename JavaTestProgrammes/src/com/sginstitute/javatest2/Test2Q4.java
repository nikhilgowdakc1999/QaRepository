package com.sginstitute.javatest2;
//method to return 1-D char array
class CharArray
{
	char[] Char()
	{
		char a[]= {'a','b','c'};
		return a;
	}
}
	public class Test2Q4 {

		public static void main(String[] args) {
			CharArray a1=new CharArray();
             char a[] =a1.Char();
             for(int i=0;i<3;i++)
     		{
     			System.out.println(a[i]);
     		}
		}

	}
