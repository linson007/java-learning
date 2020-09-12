package com.linsoft;

interface Anu
{
	int a = 9;
	void Test(int a);
	static void Remove()
	{
		System.out.println("Anu's Remove");
	}
}


 class Linson implements Anu
{
	public void Test(int x)
	{
		System.out.println(x);
	}
}

public class InterfaceSample {

	public static void main(String[] args) {

		 Linson l = new Linson();
		l.Test(3);
		l.Re
		 
	}

}
