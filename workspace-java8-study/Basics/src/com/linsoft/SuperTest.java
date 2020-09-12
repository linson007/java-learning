package com.linsoft;

class SuperA
{
	
	SuperA()
	{
		super();
		System.out.println("SuperA");
	}
}

class SuperB extends SuperA
{
	
	SuperB()
	{
		super();
		System.out.println("SuperB");
	}
	
	int c=90;
	
	//private int i =20;
}


class SuperC extends SuperB
{
	int c;
	
	SuperC()
	{
		super();
		System.out.println("SuperC");
		//System.out.println("value of "+i); private cannot acess in subclass
		

	}
	
	SuperC(SuperC ob){
		System.out.println("SuperC passing obj");
		this.c = ob.c;

	}
	
	public void print()
	{
		System.out.println("c value is "+c);
		System.out.println("c value super is "+super.c);
	}
}

public class SuperTest {

	public static void main(String[] args) {

		
		SuperC cObj = new SuperC();
		cObj.print();
		cObj.c = 20;
		SuperC cObj2 = new SuperC(cObj);
		cObj2.print();

		
		
		
	}}
