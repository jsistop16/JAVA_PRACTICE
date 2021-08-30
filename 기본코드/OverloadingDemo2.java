package org.javatutorials.overloading;

public class OverloadingDemo2 extends OverloadingDemo1 {

	void A(String arg1, String arg2){//overloading
		System.out.println("overloading");
	}
	
	void A() {//overriding
		System.out.println("overriding");
	}
	
	public static void main(String[] args) {
		
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A("every", "body");

	}

}
