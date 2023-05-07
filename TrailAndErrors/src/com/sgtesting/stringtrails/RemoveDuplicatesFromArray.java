package com.sgtesting.stringtrails;
// to remove duplicate elements from array
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int n[]= {1,6,2,7,1,3,4,7,4,9,6,7,3,1,4,3};

		for(int i=0;i<n.length;i++)
		{   //important step
			int count=0;
			for(int j=0;j<n.length;j++)
			{
				if(n[i]==n[j]&&i!=j)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(n[i]);
			}
		}

	}

}
