package com.linsoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAsIterator {

	public static void main(String[] args) {

		
		List<Integer> mylist = new ArrayList<>();
		mylist.add(2);
		mylist.add(4);
		
		
		Stream<Integer> mystream = mylist.stream();
		
		Iterator<Integer> iter = mystream.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
