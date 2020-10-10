package com.linsoft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionBasics {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(10);
		System.out.println("1:::::"+list);
		
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(20);
		temp.add(30);
		
		list.addAll(temp);
		System.out.println("list:::::"+list);
		
		System.out.println("get:::::"+list.get(3));
		
		System.out.println("indexOf:::::"+list.indexOf(10));
		
		System.out.println("lastIndexOf:::::"+list.lastIndexOf(10));
		
		System.out.println("list:::::"+list);
		System.out.println("set:::::"+list.set(3,100));
		
		System.out.println("remove:::::"+list.remove(1));
		System.out.println("list:::::"+list);
		System.out.println("indexOf:::::"+list.indexOf(20));
		
		System.out.println(list.contains(30));
		
		list.equals(temp);
		
		System.out.println(" hash code" +list.hashCode());
		
		System.out.println("list emmty :"+list.isEmpty());
		
		Iterator< Integer> ite  = list.iterator();
		ite.forEachRemaining( (n)-> System.out.println(n));
		
		//list.parallelStream().filter(predicate)
		
		
		System.out.println("contains "+list.contains(temp));
		list.clear();
		
		
	} 

}
