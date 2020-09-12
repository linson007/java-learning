package com.linsoft.creational.singleton;

class SingleTon
{
	
	static SingleTon obj = new SingleTon();
	
	private SingleTon () {}
	
	static SingleTon getInstance()
	{
		return obj;
	}
	
	public void printHai()
	{
		System.out.println("Haiiii");
	}
}
public class SingletonExample {

	public static void main(String[] args) {

		
		SingleTon obj = SingleTon.getInstance();
		obj.printHai();
	}

}
