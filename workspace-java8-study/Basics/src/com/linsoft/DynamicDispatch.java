package com.linsoft;

class AAA {
void callme() {
System.out.println("Inside A's callme method");
}
}
class BBB extends AAA {
// override callme()
void callme() {
System.out.println("Inside B's callme method");
}
}
class C extends AAA {
// override callme()
void callme() {
System.out.println("Inside C's callme method");
}
}


public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a = new AAA(); // object of type A
		BBB b = new BBB(); // object of type B
		C c = new C(); // object of type C
		
		AAA r; // obtain a reference of type A
		r = a; // r refers to an A object
		r.callme(); // calls A's version of callme
		r = b; // r refers to a B object
		r.callme(); // calls B's version of callme
		r = c; // r refers to a C object
		//r.callmeC(); // calls C's version of callme

	}

}
