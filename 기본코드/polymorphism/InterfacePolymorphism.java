package org.javatutorials.polymorphism;

interface I2{
	public String A();
}

interface I3{
	public String B();
}

class D implements I2, I3{
	public String A() {
		return "1";
	}
	public String B() {
		return "1";
	}
}

public class InterfacePolymorphism {

	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B(); 오류
		//objI2는 인터페이스 I2행세를 하므로 메소드 A만 기능시킬수있음
		
		//objI3.A(); 오류
		//objI3는 인터페이스 I3행세를 하므로 메소드 B만 기능시킬수있음
		objI3.B();
	}

}
