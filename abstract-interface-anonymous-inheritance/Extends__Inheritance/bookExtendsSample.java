import java.io.*;


class  bookBase
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


}


class bookExtendsSample extends  bookBase
{
  
  public void print()
  {
    System.out.println("entered a name for interface isssss");
		System.out.println(a);
  
  }
 

	 public static void main(String args[])
	{

				bookExtendsSample bk = new bookExtendsSample();
				bk.read();
				bk.print();
	} 

}

