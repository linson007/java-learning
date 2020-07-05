import java.io.*;


class  bookBase
{
	String a;
 
  bookBase(String xyz)
  {
	  try
	  {
			a = xyz; 
	  }
		catch(Exception e)
		{
		e.printStackTrace();	
		}	

		
  }
  
  public void print()
  {
	 System.out.println("Baseeeee"); 
  }  


}


class bookAnonymousExtends
{
 	 public static void main(String args[])
	{

				
				
				bookBase abc =	new bookBase("abc")
				{	
						@Override	
						public void print()
						{
								System.out.println("entered a name for interface isssss"+a);
						}
						
						
					
				};	
				abc.print();
	} 

}

