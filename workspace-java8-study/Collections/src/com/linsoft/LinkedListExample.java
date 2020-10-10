package com.linsoft;

import java.util.LinkedList;

class LinkedListExample {
	public static void main(String args[]) {
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		// Add elements to the linked list.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		System.out.println("" + ll);
		
		ll.addLast("Z");
		System.out.println("" + ll);
		ll.addFirst("A");
		System.out.println("" + ll);
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		// Remove elements from the linked list.
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "
				+ ll);
		
		// Remove first and last elements.
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: "
				+ ll);
		// Get and set a value.
	/*	String val = 11.get(2);
		ll.set(2, val + " Changed");
		System.out.println("ll after change: " + ll);*/
	}
}