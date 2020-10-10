package com.linsoft.examples;


class Queue
{
	int n;
	boolean valueSet = false;
	
	synchronized int get()
	{
		while(!valueSet)
			try {
				System.out.println("before wait");
			wait();
			System.out.println("after");
			} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
			}
		
		System.out.println("Q - get "+n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n)
	{
		while(valueSet)
		{	try {
			wait();
			} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Q - put "+n);
		System.out.println("before notify");
		notify();
		System.out.println("after notify");
	}
	
	
	
	
}


class ConsumerNew implements Runnable {
	Queue q;
	ConsumerNew(Queue q) {
	this.q = q;
	new Thread(this, "Consumer").start();
	}
	public void run() {
		
		int i = 0;
		while(i<10) {
		q.get();
		i++;
		
		}
	}
}

class ProducerNew implements Runnable {
	Queue q;
	ProducerNew(Queue q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run() {
		int i = 0;
		while(i<10) {
		q.put(i++);
		}
	}
}


public class InterProcessCommunicationSolution  {

	public static void main(String[] args) throws InterruptedException {
		
		Queue q = new Queue();
		
		new ConsumerNew(q);
		
		Thread.sleep(1000);
		new ProducerNew(q);
		//System.out.println("Press Control-C to stop.");

	}

}
