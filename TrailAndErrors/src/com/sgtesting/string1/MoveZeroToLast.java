package com.sgtesting.string1;

public class MoveZeroToLast {

	public static void main(String[] args) {
		int a[]= {1,0,5,0,0,6,7,0,8,4,0,6,6};
		
		for (int i=0;i<a.length;i++)
		{
           for(int j=i+1;j<a.length;j++)
           {
        	   int temp=0;
        	   if(a[i]==0)
        	   {
        		   temp=a[i];
        		   a[i]=a[j];
        		   a[j]=temp;
        	   }
           }
           System.out.print(a[i]);
		}
	}

}
