package com.SeleniumProject.javaprogrammes;

public class NesteIfEg 
{

	public static void main(String[] args)
	{
		int a=300;
		int b=200;
		int c=100;
		
		if(a>b & a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>a & b>c)
		{
			System.out.println("B is greater");
		}
		else if(c>a & c>b)
		{
			System.out.println("C is Greater");
		}
	}

}
