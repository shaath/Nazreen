package com.SeleniumProject.javaprogrammes;

public class StaticArraysEg 
{
	public static void main(String[] args) 
	{
		int[]  salary={30000,40000,50000,60000,70000,30000};
		//Finding the length of the array and printing in console
		
		System.out.println(salary.length);
		
		//Reading the data from array
//		System.out.println(salary[2]);

		for(int i=0; i < salary.length; i++)
		{
			int x=salary[i];
			System.out.println(x);
		}
	}

}
