package com.sgtesting.patternstatements;

public class Continue {

	public static void main(String[] args) {
		int i=10;
		while(i<=30)
		{
			i++;
			if(i%2==0)
			{
				continue;

			}
			System.out.println(i);
			

		}

	}

}
