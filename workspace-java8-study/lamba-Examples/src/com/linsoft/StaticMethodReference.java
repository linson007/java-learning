package com.linsoft;




interface test2
{
	 int sumuptoN(int n);
}
public class StaticMethodReference {

	
	public static int calculateSumUptoN(test2 t , int n)
	{
		return t.sumuptoN(n);
	}
	
	public  static int staticfind(int n)
	{

		
		return 20;
	
	}
	
	public   int find(int n)
	{

		return 2;
	
	}
	
	public   int find22(int n,int y)
	{

		return 2;
	
	}
	
	
	public static void main(String[] args) {

		
		StaticMethodReference sample = new StaticMethodReference();
		
		
		test2 sam = (n)->
		{
			int sum  = 0;
			for(int i = 1 ; i<=n ; i++)
			{
				sum = sum+i;
			}
			return sum;
		};
		
		test2 sam2 = StaticMethodReference::staticfind;
		
		System.out.println(calculateSumUptoN(sam, 10));
		
		System.out.println(calculateSumUptoN(sam2, 10));
		System.out.println(calculateSumUptoN(StaticMethodReference::staticfind, 10));
		System.out.println(calculateSumUptoN(sample::find, 10));
		
		
	}

}



