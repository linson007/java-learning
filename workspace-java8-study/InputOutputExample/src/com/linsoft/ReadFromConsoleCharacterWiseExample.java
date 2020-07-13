package com.linsoft;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromConsoleCharacterWiseExample {
	
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		char c  = 'a';
		do
		{
			 c = (char)br.read();
			System.out.println(""+c);
		}while(c!='q');
		
		//This output may look a little different from what you expected because System.in is line
		//buffered, by default. This means that no input is actually passed to the program until you
		//press enter. As you can guess, this does not make read( ) particularly valuable for interactive
		//console input.
		
	}

}
