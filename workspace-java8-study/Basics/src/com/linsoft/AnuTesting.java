package com.linsoft;

 class AA
 {
	 
	public void Display()
	{
		System.out.println("A");
	}
	public void DisplayA()
	{
		System.out.println("Display A");
	}
	
	 
 }
 
 
 class BB extends AA
 {
	 
	public void Display()
	{
		System.out.println("B");
	}
	public void DisplayB()
	{
		System.out.println("Display B");
	}
	
	 
 }

public class AnuTesting {

	public static void main(String[] args) {
		AA a = new AA();
		a.Display();
		a.DisplayA();
		
		System.out.println("************************");
		BB b = new BB();
		b.Display();
		b.DisplayB();
		
		System.out.println("************************");
		b.DisplayA();
		
		
		System.out.println("************************");
		
		a = b;
		
		
		a.DisplayA();
		a.Display();
	}

}
