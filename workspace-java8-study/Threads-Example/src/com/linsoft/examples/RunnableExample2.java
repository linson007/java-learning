package com.linsoft.examples;

class RunnableClass2 implements Runnable
{
	Thread t;
	
	RunnableClass2() {
		// Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
		}
	
	
	public void run()
	{
		System.out.println("am here");
		
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println( "Child at i:"+i);
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

public class RunnableExample2 {

	public static void main(String[] args) {

		
		RunnableClass2 RunnableObj = new RunnableClass2();
	
		for(int i = 0 ; i < 5; i++)
		{
			System.out.println( "Main Thread at i:"+i);
			try
			{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		//System.exit(1);
		//t.interrupt();
		
	}

}
