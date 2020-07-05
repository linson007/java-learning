
interface multipleInterfaceImplements
{

    public void InterFaceImplementationTesting();
}


interface multipleInterfaceImplements2
{


}



interface parentInterface1
{


}


interface parentInterface2
{


}

class TestInterfaceExtend
{


}



//interface cant implements another interface, but can extends other interfaces
//interface can only extend interfaces, ie , extends TestInterfaceExtend wont work
//we can add public before interface - the interface can be used by any class in any package, otherwise interface is accessible only to classes defined in the same packagess
interface FirstInterface extends parentInterface1, parentInterface2
{
 
  //int a;  This will not work . all fields are automatically public, static, and final, 
  int a = 5; 
  public void print();
//private void test();  //This will not work . all methods that you declare or define (as default methods) are public

 default boolean didItWork(int i, double x, String s) {
       return true;

   }
//An interface declaration can contain method signatures, default methods, static methods and constant definitions.
   

}


class InterfaceImplementing implements FirstInterface,multipleInterfaceImplements,multipleInterfaceImplements2
{
   
   public void print()
   {

   System.out.println("Am implementing a function of interface "+a);

   } 

    public void InterFaceImplementationTesting()
    {
	   System.out.println("Am implementing a function of interface ");
    }


}

public class InterfaceLearing {

	public static void main(String args[])
	{
		
		System.out.println("asdf");

                 //FirstInterface interfaceobj = new FirstInterface(); Interface both can't be instantiated.


                InterfaceImplementing  obj = new InterfaceImplementing();
  		obj.print();
	}
}
