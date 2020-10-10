package com.linsoft;

import java.util.ArrayList;

class ArrayListDemo {
	public static void main(String args[]) {
		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " +
				al.size());
		// Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add("g");
		al.add("F");
		al.add("h");
		al.add("F");
		System.out.println("array list "+al);
		al.add(1, "A2");
		System.out.println("array list after adding a2 "+al);
		
		
		al.set(1,"A3");
		
		System.out.println("array list after adding a3 "+al);
		System.out.println("Size of al after additions: " +
				al.size());
		// Display the array list.
		System.out.println("Contents of al: " + al);
		// Remove elements from the array list.
		
		al.remove("FF");
		al.remove(2);
		
		
		System.out.println("Size of al after deletions: " +
				al.size());
		System.out.println("Contents of al: " + al);
	}
}