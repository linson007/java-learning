package com.linsoft;

public class StringBufferSample {

 public void	print()
 {
	 System.out.println("hai");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer b = new StringBuffer("hai");
		int l = b.capacity();
		b.ensureCapacity(200);
		l = b.capacity();
		System.out.println(l);
		
		
		
		
		Runtime r = new Runtime();
		Double d1 = new Double(1/0.);
		Double d2 = new Double(0/0.);
		System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
		System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
		
		
		
		
	}

}
