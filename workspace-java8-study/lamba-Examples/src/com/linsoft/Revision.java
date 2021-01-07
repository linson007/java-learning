package com.linsoft;

interface testInt
{
	
	void test();
}
public class Revision {

	public static void main(String[] args) {

		
		testInt s = () -> System.out.println("hai"); 
		
		s.test();
		
	}

}
