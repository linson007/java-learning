package com.linsoft;


 interface test
 {
	 int sumuptoN(int n);
 }
public class PassLambdaAsArgument {

	
	public int calculateSumUptoN(test t , int n)
	{
		return t.sumuptoN(n);
	}
	
	public static void main(String[] args) {

		
		PassLambdaAsArgument sample = new PassLambdaAsArgument();
	
		int total = sample.calculateSumUptoN(
				(n) ->
				{
					int sum  = 0;
					for(int i = 1 ; i<=n ; i++)
					{
						sum = sum+i;
					}
					return sum;
				}
				, 10);
		
		System.out.println("total"+total);
		
		
		test sam = (n)->
		{
			int sum  = 0;
			for(int i = 1 ; i<=n ; i++)
			{
				sum = sum+i;
			}
			return sum;
		};
		
		System.out.println(sample.calculateSumUptoN(sam, 12));
		
		
	}

}
