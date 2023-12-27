package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNumInArray {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader iP = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array : ");
		int i = Integer.parseInt(iP.readLine());
		int array[] = new int[i];
		
		for (int j = 0; j < array.length; j++)
		{
			System.out.println("Enter Digit of Index "+j+" : ");
			array[j]= Integer.parseInt(iP.readLine());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("Provide user Input : ");
		int userNum = Integer.parseInt(iP.readLine());
		
		for (int j = 0; j < array.length; j++)
		{
			if (array[j]==userNum)
			{
				System.out.println("User input 'userNum' is in the array at index "+j+" and position "+(j+1));
			}
		}
		
		
		
		
		
	}

}
