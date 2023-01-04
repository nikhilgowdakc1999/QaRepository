package com.sgtesting.methodreturn;
class Odd141to111
{
	int[] odd(int n,int k)
	{
		int count=0;
		for(int i=n;i>=k;i--)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		int odd[]=new int[count];

		int p=0;
		for(int l=n;l>=k;l-=2)
		{
			odd[p]=l;  
			p++;	
		}return odd;
	}
}
public class ReturnOdd141to111 {

	public static void main(String[] args) {
	
		Odd141to111 a1=new Odd141to111();
		int q[]=a1.odd(141,111);
		for(int i=0;i<q.length;i++)
		{
			System.out.println(q[i]);
		}
	}
}
