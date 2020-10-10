package com.linsoft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NewSample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new  ArrayList<Integer>();
		
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(1);
		
		System.out.println(list);
		Stream<Integer> str=	list.stream();
		System.out.println(str.count());
		
		str = list.stream();
		Stream sorted = str.sorted();
		//sorted.forEach( (n)->  System.out.println(n)  );
		//sorted.forEach( (n) -> System.out.println(n));
		sorted.forEach(System.out::println);
		
		
		str = list.stream();
		
		Predicate<Integer> p = (n) -> n >=5;
		
		/*Predicate<Integer> p = (n) -> {
			
			if(n >=5)
				return true;
			else 
				return false;
		};*/
		System.out.println(" Greater than Five ");
		Stream  greaterThanFiveStream =   str.filter(p);
		greaterThanFiveStream.forEach(System.out::println);
		
		System.out.println("single line");
		list.stream().filter((n)->n>=5).forEach(System.out::println);
		
		Comparator<Integer> c = (a,b) -> {
			
			return a.compareTo(b);
		};
		
		
		list.stream().map((n)-> n+2).forEach( System.out::println);
		
		
		System.out.println(list.stream().min(c).get());
		
		
		
	}

}
