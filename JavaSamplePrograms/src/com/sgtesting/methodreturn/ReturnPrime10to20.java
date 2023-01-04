package com.sgtesting.methodreturn;
class Primeno10to20
{
	int[] Prime()
	{
		//cun should be placed above for-loop so that it counts each i nos
		int cun=0;
		for(int i=10;i<=20;i++)
		{
			int count=0;
			for(int k=1;k<=20;k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}
			if(count==2)
			{		
				cun++;
			}
		}

		int h[]=new int[cun];
		//c should be placed above for-loop so that it contains each i nos  
		int c=0;
		for(int i=10;i<=20;i++)
		{
			int count=0;
			for(int k=1;k<=20;k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				h[c]=i;
				c++;
			}
		}return h;
	}
}


public class ReturnPrime10to20 {

	public static void main(String[] args) {

		Primeno10to20 a1= new Primeno10to20();
		int a[]=a1.Prime();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
