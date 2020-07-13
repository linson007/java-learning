package com.linsoft;


enum Day 
{
	SUN,MON,TUE,WED,THU,FRI,SAT;
}
public class EnumDemo {

	public static void main(String[] args) {
		
		
	Day d  = Day.SUN;
	
	System.out.println("ordinal value"+d.ordinal());
		
	if(d == Day.SUN)
	{
		System.out.println("It is SUN");
	}
	else if(d == Day.MON)
	{
		System.out.println("It is MON");
	}
	else if(d == Day.TUE)
	{
		System.out.println("It is TUE");
	}
	else if(d == Day.WED)
	{
		System.out.println("It is WED");
	}
	else if(d == Day.THU)
	{
		System.out.println("It is THU");
	}
	else if(d == Day.FRI)
	{
		System.out.println("It is FRI");
	}
	else if(d == Day.SAT)
	{
		System.out.println("It is SAT");
	}
	
	
	System.out.println(d);
	System.out.println(Day.SAT);
	
	System.out.println("values() are ");
	Day alldays[] = Day.values();
	for(Day day : alldays)
	{
		System.out.println(day);
	}
	
	System.out.println("valueof ()");
	
	// use valueOf()
	Day newday = Day.valueOf("WED");
	System.out.println("day contains " + newday);
	
	try
	{
		newday = Day.valueOf("WEDD"); // This will throw Exception
		System.out.println("day contains " + newday);	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	 

	}

}
