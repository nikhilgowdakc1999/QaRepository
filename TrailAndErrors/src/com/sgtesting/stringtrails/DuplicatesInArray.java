package com.sgtesting.stringtrails;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int n[] = {1,1,2,2,2,3,4,5,6,6,7,7,7,8,9};
		int a[] = new int[n.length];
		int k = 0, k1 = 0;
		int count;
		for(int i = 0; i < 15; i++)
		{
			for(int j = 0; j < 15; j++)
			{
				count = 0;
				if(i != j && n[i] == n[j])
				{
					for(k1 = 0; k1 < k; k1++)
						if(a[k1] == n[j])
							count = 1;
					if(count != 1)
						a[k++] = n[j];
				}
			}
		}
		for(int i = 0; i < k; i++)
		{
			System.out.println(a[i]);
		}
	}

}
