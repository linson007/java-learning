package com.linsoft;

import java.util.Comparator;


interface ABC
{
	
	int abc();
	
	
	
}
class Generic<T extends Number  > implements ABC<T>
//class Generic
{
	T obj ;
	public T get()
	{
		return obj;
	
	}
	
	public T abc()
	{
		System.out.println(obj.doubleValue());
		return obj;
	}
	
	public void set(T t)
	{
		obj = t;
		t.doubleValue();
			
		
	}
	
	 void compare(Generic<?> test)
	 {
 		 if(test.get().doubleValue() == this.obj.doubleValue())
		 {
			 System.out.println("equal");
		 }
	 }
	void showType() {
		System.out.println("Type of T is " +
				obj.getClass().getName());
		}
	
}
public class GenericBasics {

	public static void main(String[] args) {

		
		Generic<Integer> test = new Generic<Integer>();
		test.set(3);
		int i =  test.get();
		System.out.println("i"+i);
		test.showType();
		
		
		Generic<Double> doub = new Generic<Double>();
		
		doub.set(3.0);
	
		
		

		Generic<Integer> inttt = new Generic<Integer>();
		
		inttt.set(3);
		
		//inttt.compare(test);
		
		doub.compare(test);
		
		
		/*Generic<String > strin = new Generic<String>();
		strin.set("haiii");
		String d =  strin.get();
		
		System.out.println("d"+d);*/
		
		
		
	}

}
