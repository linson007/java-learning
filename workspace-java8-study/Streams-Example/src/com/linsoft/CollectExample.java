package com.linsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Stud
 {
	 String name ;
	 String age;
	 int mark;
	 
	 Stud(String _name, String _age, int _mark )
	 {
		  name = _name;
		  age = _age;
		  mark = _mark;
	 }
 }
 
 class StudGrade
 {
	 String  name;
	 String  grade;
	 
	 StudGrade(String _name, String _grade)
	 {
		 name = _name;
		 grade = _grade;
	 }
	 
 }
public class CollectExample {

	public static void main(String[] args) {

		Stud stud1 = new Stud("A","1",85);
		Stud stud2 = new Stud("B","1",25);
		Stud stud3 = new Stud("C","1",25);
		Stud stud4 = new Stud("D","1",95);
		
		List<Stud> studlist =  new ArrayList<>();
		studlist.add(stud1);
		studlist.add(stud2);
		studlist.add(stud3);
		studlist.add(stud4);
		

		
		List<StudGrade> PassstudGradeList = 
		studlist.stream()
		.filter(
				(n) -> n.mark>50
				
				)
		.map(
					
					(n) ->
					{
						String grade = "";
						if(n.mark > 90) grade = "A";
						else grade = "Distinction";
						return new StudGrade(n.name, grade);
					}
				)
		.collect(Collectors.toList());
		
		//System.out.println(PassstudGradeList);
		for( StudGrade a : PassstudGradeList )
		{
			System.out.println("Name:"+a.name +"  Grade:"+ a.grade);
		}
		
	}

}
