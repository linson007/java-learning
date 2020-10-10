package com.linsoft;


class Q
{
	int n;
	boolean produced = false;
	
	synchronized int get()
	{
		while(!produced)
		{
			try
			{
				wait();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("consumed"+n);
		produced = false;
		notify();
		return n;
	}
	
	synchronized void put(int n)
	{
		  	while(produced)
		    {
		  		try
		  		{
		  			wait();
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  		}
		    }

		  	this.n   = n;
		  	produced = true;
		  	System.out.println("produced "+n);
	    	notify();
	    	
		  
		
		
	}
	
}

class Producer implements Runnable
{
	Q q;
	
	Producer(Q q)
	{
		this.q = q;
	}
	
	public void run()
	{
		for(int i = 0; i<10 ; i++)
		{
			  
				q.put(i);
		}
	}
	
}


class Consumer implements Runnable
{
	Q q;
	
	Consumer(Q q)
	{
		this.q = q;
	}
	
	public void run()
	{
		for(int i = 0; i<10 ; i++)
		{
				q.get();
		}
	}
}
public class InterProcessCommunication 
{

	public static void main(String[] args) {

		Q q = new Q();
		Consumer con = new Consumer(q);
		Producer p = new Producer(q);
		Thread conT = new Thread(con,"consumer");
		Thread prodT = new Thread(p,"p");
		conT.start();
		prodT.start();
		
	}

}
