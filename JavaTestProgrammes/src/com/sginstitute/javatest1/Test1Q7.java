package com.sginstitute.javatest1;
//2-D String array with each elements concatenated
public class Test1Q7 {

	public static void main(String[] args) {
		String a[][]= {{"sam","niki","vini"},{"santu","sanju","ramu"}};

		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
         //to get each elements in a column 
				System.out.print(" my name is "+a[i][k]);
			}
			System.out.println();
		}

	}

}
