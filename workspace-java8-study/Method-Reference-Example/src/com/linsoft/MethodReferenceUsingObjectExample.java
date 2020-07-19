package com.linsoft;

interface Sample2  
{
	double somefunc(double [] n);
}


class SumOfDouble2
{
	
	 double sum(double [] n)
	{
		double total = 0;
		for(int i = 0 ; i < n.length; i++)
		{
			total = total+n[i];
		}
		return total;
	}
	
}


public class MethodReferenceUsingObjectExample {

	static double calculateSumN(Sample t , double [] n)
	{
		return t.somefunc(n);
	}
	
	
	public static void main(String[] args) {

	double n [] = {1,2};
		
	SumOfDouble2 obj = new SumOfDouble2();
		double s = calculateSumN(obj::sum, n);
			System.out.println(s);
	}

}
