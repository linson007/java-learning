//https://www.javatpoint.com/difference-between-abstract-class-and-interface


class myAbstractExtendAnotherClass
{


}


interface multipleInterfaceImplements
{

    public void InterFaceImplementationTesting();
}


interface multipleInterfaceImplements2
{


}






abstract class myAbstract extends myAbstractExtendAnotherClass implements multipleInterfaceImplements,multipleInterfaceImplements2  
//5) abstract keyword is used to declare abstract class.
//6) An abstract class can extend another Java class and implement multiple Java interfaces
{

 int abc; //can have final, non-final, static and non-static variables.

  public int member1;
   private int member2;
///8) A Java abstract class can have class members like private, protected, etc.

public void InterFaceImplementationTesting()   //4) Abstract class can provide the implementation of interface.
  {
     	System.out.println("Am implementing from an Interface ");
  
  }


  public void NormalFunctionwithAbstractClass()
   //1) Abstract class can have abstract and non-abstract methods.
   {
   System.out.println("Am a normal function within an Abstract Class ");
   }

   public abstract void AbstractMethodSample();
  //1) Abstract class can have abstract and non-abstract methods.

} 


class ClassExtendingAbstract  extends myAbstract
{ //7) An abstract class can be extended using keyword "extends".	

   public void AbstractMethodSample()
   {
   System.out.println("Am implementing the abstract method of myAbstract otherwise it will give compilation error");
   } 
}
public class AbstractTesting {

	public static void main(String args[])
	{
		
		System.out.println("hiii");


		//myAbstract abc = new myAbstract();  // Abstract class and interface both can't be instantiated.

	}
}
