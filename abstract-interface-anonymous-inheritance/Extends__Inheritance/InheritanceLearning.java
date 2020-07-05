class BaseClass
{

  public int publicmember = 5;
  private int privatemember = 3;
  protected int proctectemember = 6;

  public int publicOverRide = 1;
  private int privateOverRide = 1;
  protected int protectedOverRide = 1;

  public void basefunction()
   {

	System.out.println("Inside base function"+publicmember+" "+privatemember+" "+proctectemember);
   }
   public int getprivateMember()
  { 
 return privatemember;
 }

  public void TryOverRideFunction()
 {

	System.out.println("Inside base function Over Ride Function");
  } 
}
class ChildClass extends BaseClass
{

public int publicOverRide = 2;
private int privateOverRide = 2;
protected int protectedOverRide = 2;

    public void childfunction()
   {
	System.out.println("Inside child function"+publicmember+" "+proctectemember);
	//System.out.println("privatemember"+privatemember);	This will not work. cant acess parent private directly
 	System.out.println(" "+getprivateMember());	 //This will work
        System.out.println("Over rided members "+publicOverRide+" "+privateOverRide+" "+protectedOverRide );


   }

 public void TryOverRideFunction()
 {

	System.out.println("Inside Child function Over Ride Function");
  }


}

public class InheritanceLearning
{
 public static void main(String args[])
 {
	System.out.println("linson");

ChildClass  child = new ChildClass();
child.childfunction();
child.basefunction();
child.TryOverRideFunction();
}


}
