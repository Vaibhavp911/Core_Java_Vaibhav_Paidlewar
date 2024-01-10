package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingTableHorizontally
{
	/*
	 *  Making Program to print table in horizontally using 2-D Array
	 *  Input will be taken from user and it will print table up-to that number
	 *  
	 */
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Value of Number to print table up-to that number:");
		int numTable = Integer.parseInt(br.readLine());
		// created 2-D Array for table print 
		// enter numTable + 1 value to print table up-to numTable
		int Table[][] = new int[numTable][numTable];
		
		System.out.println("---------------");
		
		// System.out.println("Entered in Loop");
		
		for (int fBlock = 1; fBlock < Table.length; fBlock++)
		{
			for (int sBlock = 1; sBlock < Table.length; sBlock++)
			{
				// multiplication occurs for the table.
				Table[fBlock][sBlock] = (fBlock*sBlock);
			}
		}
		
		for (int fBlock = 1; fBlock < Table.length; fBlock++)
		{
			for (int sBlock = 1; sBlock < Table.length; sBlock++)
			{
				System.out.printf("  %2d  |",Table[fBlock][sBlock]);
			}
			System.out.println();
		}
	}

}

/*for (int fBlock = 0; fBlock < Table.length; fBlock++)
{
	for (int sBlock = 1; sBlock < Table.length; sBlock++)
	{
		Table[fBlock][sBlock] = Integer.parseInt(br.readLine());
	}
}
*/
