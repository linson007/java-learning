package com.linsoft;


interface MyArraySumInterface {
	
	public  double sum(double [] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception
{
	EmptyArrayException()
	{
		super("Array is Empty");
	}
	
}
public class LambaExpressionWithException {

	public static void main(String[] args) {

		double input [] = { 1, 2, 3, 4, 5 };

		MyArraySumInterface findsum = (n) ->
		{
			double total = 0.0;
			if(n.length ==0)
			{
				throw new EmptyArrayException();
			}
			
		
			for(int i = 0 ; i < n.length ; i++)
			{
				total = total+n[i];
			}
			return total;
			
		};

		try
		{
			System.out.println(findsum.sum(input));;
			
			findsum.sum(new double [0]);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
