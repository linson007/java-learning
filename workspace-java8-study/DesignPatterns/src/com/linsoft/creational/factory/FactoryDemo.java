package com.linsoft.creational.factory;

public class FactoryDemo {

	
	public static void main(String args[])
	{
		ShapeFactory shapefactory = new ShapeFactory();
		
		Shape s = shapefactory.getShape("Circle");
		s.draw();
		
		
		s = shapefactory.getShape("Rectangle");
		s.draw();
		
		
		
	}
}
