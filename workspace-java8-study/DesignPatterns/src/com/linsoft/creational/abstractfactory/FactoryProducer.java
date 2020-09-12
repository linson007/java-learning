package com.linsoft.creational.abstractfactory;

public class FactoryProducer {

	
	
	public AbstractFactory getFactory(boolean rounded)
	{
		
		if(rounded)
		{
			return new RoundShapeFactory();
		}
		else
			return new NormalShapeFactory();
	}
}
