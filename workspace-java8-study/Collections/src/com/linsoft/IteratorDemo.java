package com.linsoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Spliterator;


class IteratorDemo {
	public static void main(String args[]) {
		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		// Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
	
		
		
		for(String val :al)
		{
			System.out.println(val);
		}
		
		System.out.println(".......");
		
		Spliterator<String> split =  al.spliterator();
		split.forEachRemaining(( n ) -> System.out.println(n));

		
		//while(split.tryAdvance(  ( n ) -> System.out.println(n)  ));
		
	/*	// Use iterator to display contents of al.
		System.out.print("Original contents of al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		// Modify objects being iterated.
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
			if(element.equals("B"))
			litr.add("Anu");
		}
		System.out.print("Modified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		// Now, display the list backwards.3
		System.out.print("Modified list backwards: ");
		while(litr.hasPrevious()) {

			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();*/
	}
}