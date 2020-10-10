package com.linsoft;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee
{
	String name;
	Integer rollno;
	
	Employee(int _rollno, String _name)
	{
		rollno = _rollno;
		name = _name;
	}
}

public class CompareThenExample {

	public static void main(String[] args) {

		
		
		Comparator<Employee> orderbyRollno  = (a,b) -> a.rollno.compareTo(b.rollno);
		
		Comparator<Employee> orderbyName = (a,b) -> a.name.compareTo(b.name);
		
		TreeMap<Employee, Integer> tm = new TreeMap<Employee, Integer>(orderbyRollno.thenComparing(orderbyName));
		
		tm.put(new Employee(10, "Z"), 1);
		tm.put(new Employee(9, "Y"), 1);
		tm.put(new Employee(8, "Z"), 1);
		
		tm.put(new Employee(7, "B"), 1);
		tm.put(new Employee(7, "A"), 1);
		
		tm.put(new Employee(1, "X"), 1);
		
		for( Map.Entry<Employee, Integer> em : tm.entrySet())
		{
			 System.out.println(em.getKey().rollno +"  "+em.getKey().name);
			
		}
		
	}

}
