package com.sgtesting.stringtrails;

import java.util.Arrays;

public class SortArrayExample {

	public static void main(String[] args)   
	{  
		//	Sorting1();
		//	Sorting2();
		//  Linear_Sorting();
	    // 	SelectionSort();
	    	InsertionSort();
	}  
	private static void Sorting1()
	{
		//creating an instance of an array  
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int temp = 0;  
				if (arr[i] > arr[j])   
				{  
					temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
				}  
			}  
			//prints the sorted element of the array  
			System.out.println(arr[i]);  
		}  
	}
	private static void Sorting2()
	{
		//defining an array of integer type   
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
		}   
	}
	private static void Linear_Sorting()
	{
		int a[]= {10,20,30,50,70,90};
		int key=5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println(key+" is found at "+i);
				break;
			}
		}
		System.out.println("key is not found");
	}
	private static void SelectionSort()
	{
		int[] arr = {9,14,3,2,43,11,58,22};  
		for (int i = 0; i < arr.length - 1; i++)  
		{  
			int index = i;  
			for (int j = i + 1; j < arr.length; j++)
			{  
				if (arr[j] < arr[index])
				{  
					index = j;//searching for lowest index  
				}  
			}  
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber; 
			System.out.println(arr[i]);
		} 
		
	}
	private static void InsertionSort()
	{
		int[] a = {9,14,3,2,43,11,58,22};    
	  for (int j = 1; j < a.length; j++)
	  {  
          int key = a[j];  
          int i = j-1;  
          while ( (i > -1) && ( a [i] > key ) )
          {  
              a [i+1] = a [i];  
              i--;  
          }  
          a[i+1] = key;  
          System.out.println(a[i+1]);
      }  
  }  
  
}  