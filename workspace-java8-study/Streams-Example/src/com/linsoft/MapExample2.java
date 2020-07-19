package com.linsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student
{
	String name ;
	String age;
	String mark ;
	
	Student(String _name, String _age, String _mark)
	{
		name = _name;
		age = _age;
		mark = _mark;
	}
}

class MarkSheet
{
	String name ;
	String mark;
	MarkSheet(String _name, String _mark)
	{
		name = _name;
		mark = _mark;
	}
	
	
}

public class MapExample2 {

	public static void main(String[] args) {
		
		
		Student stud1 = new Student("linson","10","1");
		Student stud2 = new Student("dinson","10","1");
		Student stud3 = new Student("ainson","10","1");
		Student stud4 = new Student("binson","10","1");
		
		List<Student> studlist = new ArrayList<>();
		studlist.add(stud1);
		studlist.add(stud2);
		studlist.add(stud3);
		studlist.add(stud4);
		
		
		/*Integer s = studlist.stream().map(  (n) -> {
			 new MarkSheet( n.name,n.mark);
		} );
		*/
		Stream<MarkSheet> markSheet =( Stream<MarkSheet> ) studlist.stream()
				
				.filter( (n)-> 
					//{ if(n.name.equalsIgnoreCase("linson")) return true; else return false; }
						n.name.equalsIgnoreCase("linson")
				  )
				.map(
				(a) -> 
				 /// {		return new MarkSheet(a.name,a.mark); }
				new MarkSheet(a.name,a.mark)
				);
		
		markSheet.forEach( (a)-> System.out.println(a.name) );
		
	}

}
