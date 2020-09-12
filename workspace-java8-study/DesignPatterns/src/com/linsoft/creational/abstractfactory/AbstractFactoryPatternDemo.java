package com.linsoft.creational.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		
		FactoryProducer factProd = new FactoryProducer();
		
		 AbstractFactory absFact = factProd.getFactory(true);
		 
		Shape s =  absFact.getShape("RECTANGLE");
		s.draw();
		 s = absFact.getShape("CIRCLE");
		 s.draw();
		 
		 absFact = factProd.getFactory(false);
		 
		 
		 s = absFact.getShape("RECTANGLE");
		 s.draw();
		 
		 s = absFact.getShape("CIRCLE");
		 s.draw();
		 
	}

}
