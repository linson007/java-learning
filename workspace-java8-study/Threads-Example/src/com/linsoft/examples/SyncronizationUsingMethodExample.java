package com.linsoft.examples;

class SyncronizationUsingMethodExampleThread implements Runnable
{
	int count = 0;
	String ThreadName = "";
	SyncronizationUsingMethodExampleThread(String ThreadName, int count) 
	{
		this.count = count;
		this.ThreadName = ThreadName ;
	}
	
	public void run()
	{
		System.out.println("Before calling printMessage of "+ThreadName);
		printMessage();
		System.out.println("After calling printMessage of "+ThreadName);
	}
	
	synchronized public void printMessage()
	// public void printMessage()
	{
		System.out.println("starting of printMessage -  "+ThreadName);
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("end of printMessage  - "+ThreadName);
	}
	
}

public class SyncronizationUsingMethodExample {

	public static void main(String[] args) {
		
		SyncronizationUsingMethodExampleThread obj1 =  new SyncronizationUsingMethodExampleThread("One",2);
		SyncronizationUsingMethodExampleThread obj2 =  new SyncronizationUsingMethodExampleThread("Two",5);
		SyncronizationUsingMethodExampleThread obj3 =  new SyncronizationUsingMethodExampleThread("Three",10);
		
		Thread Tobj1 = new Thread(obj1,"One");
		Tobj1.start();
		
		Thread Tobj2 = new Thread(obj2,"One");
		Tobj2.start();
		
		Thread Tobj3 = new Thread(obj3,"One");
		Tobj3.start();
		
		
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
					Tobj1.join(); // This method waits until the thread on which it is called terminates , ie, wait until Obj1.thread is stopped. 
					//System.out.println("This line will print once obj1.Thread is complete the execution - Obj1 join");
					Tobj2.join();
					//System.out.println("This line will print once obj2.Thread is complete the execution -  Obj2 join");
					Tobj3.join();
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
