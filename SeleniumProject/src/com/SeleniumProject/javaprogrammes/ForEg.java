package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) 
	{
		//for(initialization; condition ; incrementor)
//		{
//			Statements.....
//		}
		System.out.println("This is Incrementor Loop");
		for(int i=1; i<=100; i++)
		{
			System.out.println(i);
			if(i==75)
			{
				break;
			}
		}
		
		System.out.println("This is Decrementor Loop");
		for (int i = 100; i >= 1; i--) 
		{
			System.out.println(i);
			
		}
		
	}

}
