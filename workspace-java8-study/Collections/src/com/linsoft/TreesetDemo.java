package com.linsoft;

import java.util.*;
public class TreesetDemo {

		public static void main(String args[]) {
		// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("A");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println("tree set "+ts);
		System.out.println("treesub set "+ts.subSet("C", "F"));
		
		
		
	}
	
	

}
