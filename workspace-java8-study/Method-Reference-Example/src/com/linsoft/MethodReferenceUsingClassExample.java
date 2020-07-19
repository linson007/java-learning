package com.linsoft;

interface Sample  
{
	double somefunc(double [] n);
}

class SumOfDouble
{
	
	static double sum(double [] n)
	{
		double total = 0;
		for(int i = 0 ; i < n.length; i++)
		{
			total = total+n[i];
		}
		return total;
	}
	
}

public class MethodReferenceUsingClassExample {

	
	static double calculateSumN(Sample t , double [] n)
	{
		return t.somefunc(n);
	}
	
	
	public static void main(String[] args) {

		double n [] = {1,2};
		
		double s = calculateSumN(SumOfDouble::sum, n);
			System.out.println(s);
		
	}

}
