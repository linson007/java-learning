package com.linsoft;

import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
interface Anu
{
	
	void accept(String d);
}
public class Revision {
	
	
	public static void print(String sssss)
	{
		System.out.println(sssss);
	}
	
	
	public static void Test( Anu stp , String abc  )
	{
		stp.accept(abc);
	}

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		
		
		System.out.println("Original list: " + myList);
		// Obtain a Stream to the array list.
		Stream<Integer> myStream = myList.stream();
		// Obtain the minimum and maximum value by use of min(),
		// max(), isPresent(), and get().
		Optional<Integer> minVal = myStream.min(Integer::compare);
		if(minVal.isPresent()) System.out.println("Minimum value: " +
		minVal.get());
		// Must obtain a new stream because previous call to min()
		// is a terminal operation that consumed the stream.
		myStream = myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if(maxVal.isPresent()) System.out.println("Maximum value: " +
		maxVal.get());
		// Sort the stream by use of sorted().
		Stream<Integer> sortedStream = myList.stream().sorted();
		// Display the sorted stream by use of forEach().
		System.out.print("Sorted stream: ");
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		// Display only the odd values by use of filter().
		Stream<Integer> oddVals =
		myList.stream().sorted().filter((n) -> (n % 2) == 1);
		System.out.print("Odd values: ");
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		// Display only the odd values that are greater than 5. Notice that
		// two filter operations are pipelined.
		oddVals = myList.stream().filter( (n) -> (n % 2) == 1)
		.filter((n) -> n > 5);
		System.out.print("Odd values greater than 5: ");
		oddVals.forEach((n) -> System.out.print(n + " ") );
		System.out.println();
		//ArrayList<Integer> blist = alist.stream().mapToInt( (f) -> f+2 ).collect(Collectors.toList());
		
	}

}
