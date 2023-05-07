package com.sgtesting.constructor;
//continue statement with while loop
public class ContinueWhile {

	public static void main(String[] args) {
		int i=10;
		while(i<=30)
		{
			i++;
			if(i%2==0)
			{
			//continue statement skips iteration
				continue;

			}
			System.out.println(i);
			

		}

	}

}
