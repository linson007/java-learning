package com.linsoft;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.*;

public class FirstExample {

	public static void main(String[] args) {

		
		ArrayList<Integer> myList = new ArrayList<>( );
		
		myList.add(1);
		myList.add(10);
		myList.add(22);
		myList.add(22);
		
		System.out.println("My List "+myList);
		
		// Obtain a Stream to the array list.
		Stream<Integer> myStream = myList.stream();
		
		System.out.println("count"+myStream.count());
		
		// Must obtain a new stream because previous call to min()
		// is a terminal operation that consumed the stream.
		myStream = myList.stream();
		System.out.println("distinct"+myStream.distinct().count());
		
		
		// Must obtain a new stream because previous call to min()
		// is a terminal operation that consumed the stream.
		myStream = myList.stream();
		Optional<Integer> min = myStream.min(Integer::compare);
		if(min.isPresent()) System.out.println(min.get());
		
		
		Stream<Integer> sortedStream = myList.stream().sorted();
		
		sortedStream.forEach((n) -> System.out.println(n));
		
		System.out.println("odd numbers");
		//Stream<Integer> oddStream =
				myList.stream()
				.filter((n) ->(n%2==1))
				///;
		
		//oddStream
		.forEach( (n)-> System.out.println(n));;
	}

}
