package com.linsoft;


// Demonstrate an inner class.
class Outer {
	
	class Inner {
		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
	
	int outer_x = 100;
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	// this is an inner class
	
}
public class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();

		
		Inner inner = new Inner();
		inner.display();
	
	}
}