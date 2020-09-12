package com.linsoft;

public class StringBasics {

	public static void main(String[] args) {
		
		String s = new String();
		
		char [] ch =  { 'l', 'i', 'n', 's' ,'o', 'n'};
		
		String linson = new String(ch);
		System.out.println(linson);
		String linson2 = new String(ch, 1, 2);
		System.out.println(linson2);
		//new String(bytes)
		byte [] by =  { 65,66,67,68,69,70};
		String abc = new String(by);
		System.out.println(abc);
		String abc2 = new String(by, 1, 2);
		System.out.println(abc2);
		
		//Region Match
		
		String str1 = "linsonkurian";
		String str2 = "kurian";
		
		boolean find = str1.regionMatches(6, str2, 0, 5);
		System.out.println(find);
		
		
		if( str1.compareTo(str2) <0)
		{
			System.out.println("leser");
		}
	}

}
