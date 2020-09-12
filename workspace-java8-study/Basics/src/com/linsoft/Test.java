package com.linsoft;


class Box
{

	Box()
	{
		
		
	}
	Box(int width, int h)
	{
		System.out.println("constructerr");
		///this.width = w;
		this.width  = width;
		
	}
	
	static int z = 3;
	 int width;
	int height;
	
	
	static
	{
		
		System.out.println("static block"+z);
		z = 100;
	}
	
	
	static void Print()
	{
		System.out.println("printtt"+z);
	}
	
}
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


	System.out.println("linson");
		Box b1 = null;
		System.out.println("am here");
		
		b1 = new Box(5,10);
		System.out.println("after new");
		b1.width = 5;
		Box b2 = b1;
		
		System.out.println(b2.width);
		{
			Box b3 =  new Box();
			
		}
		
		 System.gc(); 
		

		System.out.println("final");
		
		Box.Print();
		

}
	
}	
