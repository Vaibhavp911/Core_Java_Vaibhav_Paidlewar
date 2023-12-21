package com.mkpits.arrays;

public class RemoveChar {

	public static void main(String[] args)
	{
		/*String name = "vaibhav paidlewar";
		char ch[] = new char[name.length()];
		
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = 0; j < ch.length; j++)
			{
				if (name.charAt(i) == name.charAt(j))
				{
					name.charAt(j)=RemoveChar;
				}
				
			}
		}
		*/
		double a = 1;
		//double sixtyDeg = Math.asin(90.000000);
		System.out.println(Math.asin(a));
		
		String name[] = {"vaibhav paidlewar"};
		System.out.println("s");
		for (int i = 0; i < name.length; i++)
		{
			for (int j = i+1; j < name.length; j++)
			{
				if (name[i]==name[j])
				{

					System.out.println(i);
				}
				
			}
		}
	}
}

