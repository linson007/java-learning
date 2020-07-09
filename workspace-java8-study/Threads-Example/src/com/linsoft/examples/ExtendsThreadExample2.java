package com.linsoft.examples;



 class ExtendsThread2 extends Thread
{
	 
	 ExtendsThread2()
	 {
		 super("new Thread");
			start() ; //Thread object is not required to  create
	 }
	
	 public void run()
	 {
		 System.out.println("Inside Run");
	 }
	 
	
}
public class ExtendsThreadExample2 {

	public static void main(String[] args) {

		ExtendsThread2 obj = new ExtendsThread2();
	/*	Thread t = new Thread(obj,"my thread");
		t.start();*/
		
	}

}
