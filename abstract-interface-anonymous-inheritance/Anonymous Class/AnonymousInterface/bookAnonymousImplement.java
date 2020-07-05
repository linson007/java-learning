import java.io.*;

  interface  bookInt
{	
	public void print();

}


 public class bookAnonymousImplement 
{
  	 public static void main(String args[])
	{
		
		int a = 25;
		bookInt abc =	new bookInt()
				{	
						
						public void print()
						{
								System.out.println("entered a name for interface isssss");
								System.out.println("local variable"+a);
						}
					
				};	
				abc.print();
	} 

}

