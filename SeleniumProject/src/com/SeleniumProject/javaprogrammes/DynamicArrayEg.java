package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] data=new Object[6];
		
		//Finding the length of the array
		System.out.println(data.length);
		
		//Writing the data into array
		
		data[2]="Nazreen";
		data[4]=50000;
		data[5]="Selenium";
		data[2]="Apple";
		
		//Reading the data from an array
		
//		System.out.println(data[2]);
		for (int i = 0; i < data.length; i++) 
		{
			System.out.println(data[i]);
		}

	}

}
