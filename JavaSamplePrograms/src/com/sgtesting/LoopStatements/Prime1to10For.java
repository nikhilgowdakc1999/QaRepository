package com.sgtesting.LoopStatements;

public class Prime1to10For {

	public static void main(String[] args) {

		for(int i=2;i<=10;i++)
		{
			int count=0;
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}

			if(count==0)
			{
				System.out.println(i);
			}

		}

	}
}




