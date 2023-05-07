package com.sgtesting.stringtrails;

public class Converting2DTo1DArray {
	// Driver program
	public static void main(String arg[])
	{
		
		// Initialising a 2-d array
		int grid[][] = {{1, 2, 3},
				        {4, 5, 6},
				        {7, 8, 9}};
		
		// Declaring number of rows and columns
				int array[]=new int[grid.length*grid[0].length];

		// storing elements in 1-d array
		//int k = 0;
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[0].length; j++)
			{
			  int k = (i * grid[0].length) + j;
				array[k] = grid[i][j];
				k++;
			}
		}

		// displaying elements in 1-d array
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[0].length; j++)
				System.out.print((array[(i * grid[0].length) + j])+" ");
			
		}

	}

}


