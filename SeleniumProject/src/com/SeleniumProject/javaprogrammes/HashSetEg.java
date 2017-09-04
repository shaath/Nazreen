package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) 
	{
		//Declaration of HashSet
		Set<Object> x=new HashSet<Object>();
		//Writing the data into hash set
		x.add("Selenium");
		x.add(30000);
		x.add(true);
		x.add("Apple");
		x.add("UFT");
		x.add("Apple");
		
		//Reading the data from hashset
		Iterator<Object> it=x.iterator();
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}
	}
}
