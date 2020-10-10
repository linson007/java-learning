package com.linsoft;

abstract class test
{
	int a;
	
	abstract public void test();
	
	public void concrete()
	{
		System.out.println("jao");
	}
}

interface test2
{
	int j = 5;
	
	 void interfacefunction();
	
	
}
public class StaticTest implements test2 {

	static int i = 0;
	
	static
	{
		
		i = 10;
		System.out.println(i);
	}
	public void interfacefunction()
	{
		System.out.println("interfacee");
	}
	
	public static void main(String[] args) throws Exception {
		test2 obj = new StaticTest();
		System.out.println("vv "+obj.j);
		obj.interfacefunction();
		
		 
	}

}
