package com.linsoft.examples;

class SyncronizationUsingStatementExampleThread implements Runnable
{
	Thread t;
	int count = 0;
	SyncronizationUsingStatementExampleThread(String ThreadName, int count) {
		// Create a new, second thread
		t = new Thread(this, ThreadName);
		this.count = count;
		//System.out.println("Child thread: " + t);
		t.start(); // Start the thread
		}
	
	
	public void run()
	{
		System.out.println("Before calling printMessage of "+t.getName());
		printMessage();
		System.out.println("After calling printMessage of "+t.getName());
		
		
	}
	
	public void printMessage()
	// public void printMessage()
	{
		Object obj = null;
		synchronized(SyncronizationUsingStatementExampleThread.class)
		{
			System.out.println("starting of printMessage -  "+t.getName());
			try
			{
				t.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("end of printMessage  - "+t.getName());
		}
	
	}
	
}

public class SyncronizationUsingStatementExample {

	public static void main(String[] args) {

		
		SyncronizationUsingStatementExampleThread obj1 =  new SyncronizationUsingStatementExampleThread("One",2);
		SyncronizationUsingStatementExampleThread obj2 =  new SyncronizationUsingStatementExampleThread("Two",5);
		SyncronizationUsingStatementExampleThread obj3 =  new SyncronizationUsingStatementExampleThread("Three",10);
		
/*		System.out.println("Thread One is alive: "
				+ obj1.t.isAlive());
				System.out.println("Thread Two is alive: "
				+ obj2.t.isAlive());
				System.out.println("Thread Three is alive: "
				+ obj3.t.isAlive());*/
				// wait for threads to finish
		
				try 
				{
					System.out.println("Waiting for threads to finish.");
					obj1.t.join(); // This method waits until the thread on which it is called terminates , ie, wait until Obj1.thread is stopped. 
					//System.out.println("This line will print once obj1.Thread is complete the execution - Obj1 join");
					obj2.t.join();
					//System.out.println("This line will print once obj2.Thread is complete the execution -  Obj2 join");
					obj3.t.join();
					//System.out.println("This line will print once obj1.Thread is complete the execution-   Obj3 join");
				} catch (InterruptedException e)
				{
					System.out.println("Main thread Interrupted");
				}
					/*System.out.println("Thread One is alive: "
					+ obj1.t.isAlive());
					System.out.println("Thread Two is alive: "
					+ obj2.t.isAlive());
					System.out.println("Thread Three is alive: "
					+ obj3.t.isAlive());*/
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
