package com.linsoft;


enum DayNew
{

	SUN(0),MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6);
	private int number;
	
	DayNew(int n) //constructor
	{
		number = n;
	}
	 int getDayNumber()
	{
		return number;
	}
}
public class EnumAsClassType {

	public static void main(String[] args) {
		
		
	DayNew d  = DayNew.WED;
	
	System.out.println("D number of Friday "+DayNew.FRI.getDayNumber());
	System.out.println("D number of Wednesday "+d.getDayNumber());
	
	
	for(DayNew a : DayNew.values())
	{
		System.out.println (a+" " +  a.getDayNumber());
		
	}
	
	

	}

}
