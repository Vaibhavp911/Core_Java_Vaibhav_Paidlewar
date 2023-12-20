package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name[]= {"Vaibhav", "Sanjay", "Paidlewar" };
		System.out.println("Enter Full Name oF Candidate: "+name[0]+" "+name[1]+" "+name[2]);
		
		System.out.println("***************************************************************************");
		int sorTing[] = new int[4];
		// Datatype arrayname[]=new Datatype[size];
		
		for (int i = 0; i < sorTing.length; i++)
		{
			System.out.println("Enter Data "+i);
			sorTing[i]= Integer.parseInt(reader.readLine());
		}
		System.out.println("***************************************************************************");
		// Bubble Sorting
		/*
		for (int i = 0; i < sorTing.length; i++)
		{
			for (int j = i+1 ; j < sorTing.length; j++)
			{
				if (sorTing[i]>sorTing[j])
				{
					int temp = sorTing[i];
					sorTing[i] = sorTing[j];
					sorTing[j] = temp;
				}
			}
		}
		*/
		
		// imported array package sort method called directly to convert it in ascending order. it works same as above bubble sort
		Arrays.sort(sorTing);
		
		
		System.out.println("Data after Sorting ascending order ----> ");
		for (int i = 0; i < sorTing.length; i++) 
		{
			System.out.println("Data at "+i+" is "+sorTing[i]);
		}
		
		
		for (int i = 0; i < sorTing.length; i++)
		{
			for (int j = i+1 ; j < sorTing.length; j++)
			{
				if (sorTing[i]<sorTing[j])
				{
					int temp = sorTing[i];
					sorTing[i] = sorTing[j];
					sorTing[j] = temp;
				}
			}
		}
		
		System.out.println("***************************************************************************");
		System.out.println("Data after Sorting descending order ----> ");
		for (int i = 0; i < sorTing.length; i++) 
		{
			System.out.println("Data at "+i+" is "+sorTing[i]);
		}
	}

}
