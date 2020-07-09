package com.linsoft.examples;



 class ExtendsThread extends Thread
{
	
	 public void run()
	 {
		 System.out.println("Inside Run");
	 }
	 
	
}
public class ExtendsThreadExample {

	public static void main(String[] args) {

		ExtendsThread obj = new ExtendsThread();
		Thread t = new Thread(obj,"my thread");
		t.start();
		
	}

}
