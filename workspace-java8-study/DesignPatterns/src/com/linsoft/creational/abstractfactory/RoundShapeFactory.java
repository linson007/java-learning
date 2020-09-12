package com.linsoft.creational.abstractfactory;

public class RoundShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType)
	{
		
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new RoundRectangle();
		}
		else if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new RoundCircle();
		}
		
		return null;
		
	}

}
