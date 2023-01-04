package com.sgtesting.methodreturn;
class Even50to80
{
	int[] Even(int n,int k)
	{
		int count=0;
		for(int i=n;i<=k;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		int even[]=new int[count];

		int p=0;
		for(int l=n;l<=k;l++)
		{
			if(l%2==0)
			{
				even[p]=l;
				p++;
			}
		}return even;
	}
}
public class ReturnEven50to80 {

	public static void main(String[] args) {

		Even50to80 a1=new Even50to80();
		int q[]=a1.Even(50,80);
		for(int i=0;i<q.length;i++)
		{
			System.out.println(q[i]);
		}
	}

}
