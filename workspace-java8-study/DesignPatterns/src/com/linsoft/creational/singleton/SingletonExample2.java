package com.linsoft.creational.singleton;


class SingleTonNew
{
	SingleTonNew obj = null;
	
	private SingleTonNew () {}
	
	public SingleTonNew getInstance()
	{
		if(obj==null)
		{
			 synchronized (SingleTonNew.class) {
				
				 obj = new SingleTonNew();
			}
		}
			return obj;
	}
	
	public void printHai()
	{
		
		System.out.println("Haiiii");
	}
	
	
}
public class SingletonExample2 {

	public static void main(String[] args) {
	  
		SingleTonNew objjj =SingleTonNew.get
	}

}
