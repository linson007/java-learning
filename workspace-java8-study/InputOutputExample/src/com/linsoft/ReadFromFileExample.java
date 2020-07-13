package com.linsoft;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromFileExample {

	public static void main(String[] args) {
		
		
		File file  = new File("D:\\sample.txt");
		
		try
		{
			FileInputStream fis = new FileInputStream(file);
			
			int i ;
			while( (i = fis.read()) != -1)
			{
				System.out.print((char)i);
			}
			
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
