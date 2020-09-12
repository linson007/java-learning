package com.linsoft.creational.abstractfactory;

public class NormalShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType)
	{
		
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		
		return null;
	}
}
