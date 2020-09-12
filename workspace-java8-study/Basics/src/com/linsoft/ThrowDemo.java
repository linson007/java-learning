package com.linsoft;


class MyException extends Exception
{
	String message = "";
	MyException(String _message)
	{
			this.message = _message;
	}
	@Override
	public String toString()
	{
		return "Errror occured "+message;
	}
}
public class ThrowDemo {
	static void throwOne() throws MyException {
		System.out.println("Inside throwOne.");
		throw new MyException("demo");
		
		
	}
	public static void main(String args[]) throws MyException {
		throwOne();
	}
}