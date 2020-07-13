package com.linsoft;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromConsoleStringWiseExample {
	
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		char c  = 'a';
		String line = "";
		do
		{
			  line = br.readLine();
			System.out.println(""+line);
		}while(!line.equalsIgnoreCase("STOP"));
		
		
		
	}

}
