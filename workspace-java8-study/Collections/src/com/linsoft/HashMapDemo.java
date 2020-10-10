package com.linsoft;


import java.util.*;
class HashMapDemo {
	public static void main(String args[]) {
		// Create a hash map.
		
	/*	int MAXIMUM_CAPACITY = 1 << 30;
		System.out.println(MAXIMUM_CAPACITY);
		
		 int n = 100 - 1;
		 System.out.println(n);
		System.out.println(n >>> 1);
	        n = n | n >>> 1;
		
		System.out.println(n);
	        n = n| n >>> 2;
	        System.out.println(n);
	        n = n | n >>> 4;
	        
	        System.out.println(n);
	        n = n| n >>> 8;
	        System.out.println(n);
	        n = n | n >>> 16;
	        System.out.println("24"+n);
	        int size =  (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	       System.out.println(size);*/
	        
	        
		HashMap<String, Double> hm = new HashMap<String, Double>();
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		// Get a set of the entries.
		
		hm.entrySet();
		
		
		
		for(Map.Entry<String, Double> me : hm.entrySet())
		{
			me.getKey();
			me.getValue();
			
			
			
		}
		
		for(Map.Entry<String, Double> me : hm.entrySet()) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println("--------------------------------------------------");
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		// Display the set.
		for(Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into John Doe's account.
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);

		System.out.println("John Doe's new balance: " +
				hm.get("John Doe"));
	}
}