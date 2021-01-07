package com.linsoft;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Revision {

	public static void main(String args[])
	{
		
		LinkedHashMap<String, String> hm = new LinkedHashMap<String ,String>();
		hm.put("A", "AA");
		hm.put("C", "CC");
		hm.put("B", "BB");
		
		
		
		 for(Map.Entry<String, String> entryset : hm.entrySet() )
		 {
			 
			System.out.print(entryset.getKey()+" "); ;
			 System.out.println(entryset.getValue());
			 
		 }
		 
		 
		 TreeSet<String> set = new TreeSet<String>();
		 set.add("B");
		 set.add("A");
		 set.add("C");
		 
		 for(String s : set)
		 {
			System.out.println(s); 
		 }
		  Iterator i = set.iterator();
		  while(i.hasNext())
		  {
			  System.out.println(i.next());
		  }
		 
	}
}
