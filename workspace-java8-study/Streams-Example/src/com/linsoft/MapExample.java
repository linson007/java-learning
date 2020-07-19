package com.linsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> mylist = new ArrayList<>();
		mylist.add(2);
		mylist.add(4);
		
		
		Stream<Integer> mystream = mylist.stream();
		Stream<Integer> squaremystream  = mystream.map( (n) -> n*n );
		int sum_of_square = squaremystream.reduce( 0 , (a,b) -> a +b );
		System.out.println(sum_of_square);
		
	}

}
