package com.linsoft.examples;


class Q
{
	int n;
	
	synchronized int get()
	{
		System.out.println("Q - get "+n);
		return n;
	}
	
	synchronized void put(int n)
	{
		System.out.println("Q - put "+n);
		this.n = n;
	}
	
	
	
	
}


class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
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

class Producer implements Runnable {
	Q q;
	Producer(Q q) {
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


public class InterProcessCommunicationProblem {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");

	}

}
