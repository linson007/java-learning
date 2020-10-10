package com.linsoft.examples;



 class ExtendsThread extends Thread
{
	 ExtendsThread()
	 {
		 super("anu");
		 start();
	 }
	 
	 public void run()
	 {
		 System.out.println("Inside Run");
		 System.out.println(Thread.currentThread().getName());
	 }
	 
	
}
public class ExtendsThreadExample {

	public static void main(String[] args) {

		ExtendsThread obj = new ExtendsThread();
		//obj.start();
		//Thread t = new Thread(obj,"my thread");
		//t.start();
		
	}

}
