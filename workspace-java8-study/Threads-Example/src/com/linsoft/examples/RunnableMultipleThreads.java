package com.linsoft.examples;

class RunnableMultiple implements Runnable
{
	Thread t;
	
	RunnableMultiple(String ThreadName) {
		// Create a new, second thread
		t = new Thread(this, ThreadName);
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
		}
	
	
	public void run()
	{
		System.out.println("am here");
		
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println( t.getName()+"at i:"+i);
			try
			{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}

public class RunnableMultipleThreads {

	public static void main(String[] args) {

		
		 new RunnableMultiple("One");
		 new RunnableMultiple("Two");
		 new RunnableMultiple("Three");
		 
	
		{
			System.out.println( "Main Thread at after Create Threads");
			try
			{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Main Thread completed");
		
		
	}

}
