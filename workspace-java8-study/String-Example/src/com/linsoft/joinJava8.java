package com.linsoft;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class joinJava8 {

	public static void main(String[] args) {

			// String.join(delimiter, Charracter sequence ..)
		String b = String.join(",", "Linson ","Kurian", "Pnathappillil");
		System.out.println(b);
		
		String c  = String.join("-", Arrays.asList("linson","Kurian" ));
		System.out.println(c);
		String abc = "ABCDEFG";
		System.out.println(abc.codePointAt(0));
		
		List<String> strings = new LinkedList<>();
	     strings.add("Java");strings.add("is");
	     strings.add("cool");
	     String message = String.join(" ", strings);
	     //message returned is: "Java is cool"

	     Set<String> strings2 = new LinkedHashSet<>();
	     strings2.add("Java"); strings2.add("is");
	     strings2.add("very"); strings2.add("cool");
	     String message2 = String.join("-", strings2);
	     //message returned is: "Java-is-very-cool"
	}

}
