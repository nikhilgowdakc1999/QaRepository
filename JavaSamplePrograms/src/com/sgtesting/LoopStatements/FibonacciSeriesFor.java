package com.sgtesting.LoopStatements;

public class FibonacciSeriesFor {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=1;i<=8;i++)
		{
			int third=first+second;
			first=second;
			second=third;
//print should be provided inside loop only bcz already 2 nos r printed outside 
			System.out.println(third);
		}

	}

}
