package com.linsoft;


interface functionalWithoutArgument
{
	void printHelloWorld();
}

interface withSingleArguemnt
{
	
	void SayHai(String  name);
}


interface withSingleReturnType
{
	
	int addFive(int  n);
}

interface factorial
{
	int fact(int n);
}

interface StringReverse
{
	String reverse(String n);
}
public class SimpleLambaExample {

	public static void main(String[] args) {

		
		
/*		functionalWithoutArgument lambdaExmaple =  ()   -> {
			 System.out.println("helloWorld");
		 };*/
		 
		 
			functionalWithoutArgument lambdaExmaple =  ()   -> System.out.println("helloWorld");
		 
		 lambdaExmaple.printHelloWorld();
		 
		 
		/* withSingleArguemnt SayHaiSample = (n) -> {
			 System.out.println("Hai "+n);
		 };
		 SayHaiSample.SayHai("Linson");
		 
		 
		 withSingleReturnType addFiveSample = (n) ->
		 {
			  return n+5;
		 };
		 
		 
		 withSingleReturnType addFiveSampleNew = (n) -> n+5;;
		 
		 
		 System.out.println(addFiveSample.addFive(1));
		 
		 System.out.println(addFiveSampleNew.addFive(2));
		 
		 factorial fact = (n) -> {
			 
			 int factorail  = 1;
			 for(int i = 1 ; i <=n ; i++)
			 {
				 factorail = factorail*i;
			 }
			 return factorail;
		 };
		 
		 System.out.println(fact.fact(5));
		 
		 StringReverse reverseOf = (n) ->
		 {
			String ret = "";
			
			for(int i = n.length()-1; i>=0; i--)
			{
				ret = ret+n.charAt(i);
			}
			return ret;
		 };
		 
		 
		System.out.println(reverseOf.reverse("linson"));*/
		 
	}

}
