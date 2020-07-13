package com.linsoft;

interface someFun<T> {
	
	T func(T t);
}
public class GenericFunctionalInterfaceExample {

	public static void main(String[] args) {

		
		
		someFun<Integer> fact = (n) -> {
			 
			 int factorail  = 1;
			 for(int i = 1 ; i <=n ; i++)
			 {
				 factorail = factorail*i;
			 }
			 return factorail;
		 };
		 
		 System.out.println(fact.func(5));
		 
		 someFun<String> reverseOf = (n) ->
		 {
			String ret = "";
			
			for(int i = n.length()-1; i>=0; i--)
			{
				ret = ret+n.charAt(i);
			}
			return ret;
		 };
		 
		 
		System.out.println(reverseOf.func("linson"));
		
	}

}
