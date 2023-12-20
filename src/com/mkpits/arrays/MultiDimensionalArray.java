package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray {

	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int mD[][] = new int [3][2];
		System.out.println("Fill the Array: ");
		for (int i = 0; i < mD.length; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.println("Enter Data for mD ["+i+"]["+j+"]");
				mD[i][j] = Integer.parseInt(read.readLine());
			}
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i = 0; i < mD.length; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.println("Data at mD["+i+"]["+j+"] : "+mD[i][j]);
			}
		}
		
		
	}

}
