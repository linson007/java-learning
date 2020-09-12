package com.linsoft.creational.factory;

public class ShapeFactory {
	
	
	public Shape getShape(String shape_type)
	{
		if(shape_type.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else 	if(shape_type.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		
		return null;
		
		
	}

}
