package com.linsoft.examples;

class JoinExampleThread implements Runnable
{
	Thread t;
	int count = 0;
	JoinExampleThread(String ThreadName, int count) {
		// Create a new, second thread
		t = new Thread(this, ThreadName);
		this.count = count;
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
		}
	
	
	public void run()
	{
		System.out.println("am here");
		
		for(int i = 0 ; i < count; i++)
		{
			System.out.println( t.getName()+" at i:"+i);
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

public class JoinExample {

	public static void main(String[] args) {

		
		JoinExampleThread obj1 =  new JoinExampleThread("One",2);
		JoinExampleThread obj2 =  new JoinExampleThread("Two",5);
		JoinExampleThread obj3 =  new JoinExampleThread("Three",10);
		
		System.out.println("Thread One is alive: "
				+ obj1.t.isAlive());
				System.out.println("Thread Two is alive: "
				+ obj2.t.isAlive());
				System.out.println("Thread Three is alive: "
				+ obj3.t.isAlive());
				// wait for threads to finish
		
				try 
				{
					System.out.println("Waiting for threads to finish.");
					obj1.t.join(); // This method waits until the thread on which it is called terminates , ie, wait until Obj1.thread is stopped. 
					System.out.println("This line will print once obj1.Thread is complete the execution - Obj1 join");
					obj2.t.join();
					System.out.println("This line will print once obj2.Thread is complete the execution -  Obj2 join");
					obj3.t.join();
					System.out.println("This line will print once obj1.Thread is complete the execution-   Obj3 join");
				} catch (InterruptedException e)
				{
					System.out.println("Main thread Interrupted");
				}
					System.out.println("Thread One is alive: "
					+ obj1.t.isAlive());
					System.out.println("Thread Two is alive: "
					+ obj2.t.isAlive());
					System.out.println("Thread Three is alive: "
					+ obj3.t.isAlive());
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
