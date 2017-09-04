package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		x.add("Apple");
		x.add(20000);
		x.add(true);
		x.add(444.444);
		x.add('M');
		
		x.add(5, "Selenium");
		
		x.add(2, "UFT");
		
		//Finding the size of the arraylist
		System.out.println(x.size());
		
		//Reading the data from arraylist
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
	}

}
