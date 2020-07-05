import java.io.*;


interface  bookInt
{
	
	public void read();
	public void print();



}


class book implements  bookInt
{
  String a;
  
  public void read()
  {
	  try
	  {
		  
				  System.out.println("enter a name for interface");
	  InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		a = br.readLine();
	  }
		catch(Exception e)
		{
		e.printStackTrace();	
		}	

		
  }
  
  public void print()
  {
    System.out.println("entered a name for interface isssss");
		System.out.println(a);
  
  }
 

	 public static void main(String args[])
	{

				book bk = new book();
				bk.read();
				bk.print();
	} 

}

