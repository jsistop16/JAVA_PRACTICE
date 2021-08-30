package org.javatutorials.overloading;

public class OverloadingDemo1 {
	
	void A() {System.out.println("void A ()");}
	void A(int arg1) {System.out.println("void A (String arg1)");}
	//int A() {System.out.println("void A()");}
	void A(String arg1) {System.out.println("void A (String arg1)");}
	//void A(int param1) {System.out.println("void A (String arg1)");}
	
	public static void main(String[] args) {
		OverloadingDemo1 od = new OverloadingDemo1();
		od.A();
		od.A(1);
		od.A("javajava");

	}

}
