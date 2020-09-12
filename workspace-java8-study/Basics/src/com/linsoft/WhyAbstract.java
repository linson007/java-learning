package com.linsoft;


abstract class Figure

{
	
	abstract public void area();
	/*{
		System.out.println("Un defined");
	}*/
	
	private void printHai()
	{
		System.out.println("haiii");
	}
	
	
}

class Rectangle extends Figure
{
	int  a, b;
	
	Rectangle(int x, int y)
	{
		a = x;
		b = y;
	}
	public void area()
	{
		System.out.println("Area of rectangle"+(a*b));
	}
}


class Circle extends Figure
{
	int  r ;
	
	Circle(int x)
	{
		r = x;
	}
	public void area()
	{
		System.out.println("Area of circle"+3.14*(r*r));
	}
	
	
}

public class WhyAbstract {

	public static void main(String[] args) {

		//Figure f = new Figure();
		Rectangle rectangle = new Rectangle(1,2);

		Circle c = new Circle(3);
		
		//f.area();
		
		Figure f = rectangle;
		f.area();
		
		 f = c;
		f.area();
		
		
		
		
		
		
	}

}
