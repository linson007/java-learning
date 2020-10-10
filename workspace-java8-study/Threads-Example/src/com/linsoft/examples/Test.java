package com.linsoft.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(5);
		arraylist.add(7);
		
		Iterator<Integer> it = arraylist.iterator();
		
		while(it.hasNext())
		{
			int i = it.next();
			System.out.println(i);
			
		}
		
		ListIterator<Integer> listit = arraylist.listIterator();
		while(listit.hasNext())
		{
			System.out.println("next"+listit.next());
		}
		int j = 0;
		while(listit.hasPrevious())
		{
			System.out.println("prev"+listit.previous());
			listit.set(j);
			j++;
		}
		
		for(int i = 0 ; i< arraylist.size(); i++)
		{
			System.out.println(arraylist.get(i));
		}
			
	}

}
