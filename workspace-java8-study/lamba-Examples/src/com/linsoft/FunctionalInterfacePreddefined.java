package com.linsoft;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface pre
{
	
	
	void print(int n);
}
public class FunctionalInterfacePreddefined {

	public static void main(String[] args) {

		/*
		pre p = (n) -> { System.out.println(n); }
		;
		p.print(10);*/
		
		
		
		Consumer p = (n) -> { System.out.println(n); }
		;
		p.accept("haii");
		
		
		Supplier s = () -> {
			return 5;
		};

		System.out.println(s.get());
		
		int n = 10;
		Predicate<Integer > pred = (a) -> {

			boolean even = false;
			if(a%2==0)  {
				even = true; 
			}
			return even;
		};
		
		pred.test(n);
}

}