package com.linsoft.examples;

class RunnableClass implements Runnable
{
	
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

public class RunnableExample {

	public static void main(String[] args) {

		
		RunnableClass RunnableObj = new RunnableClass();
		Thread t  = new Thread(RunnableObj, "my Thread");
		System.out.println("Name "+t.getName());
		System.out.println("ID "+t.getId());
		System.out.println("Priority "+t.getPriority());
		System.out.println("Active Count "+t.activeCount());
		System.out.println("State "+t.getState());
		System.out.println("State "+t.isAlive());
		System.out.println("State "+t.isDaemon());
		System.out.println("State "+t.isInterrupted());
		System.out.println("State "+t.getState());
		
		t.start();
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
