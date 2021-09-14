package org.javatutorials.reference;

public class ReferenceDemo2 {
	
	static void _value(int b) {
		b=2;
	}
	
	static void runValue() {
		int a=1;
		_value(a);
		System.out.println("runValue, "+a);
	}
	
	static void _reference1(A b) {
		b = new A(2);
	}
	
	static void runReference1() {
		A a = new A(1);//인스턴스 a 생성
		_reference1(a);//a가 매개변수로 전달
		//A b = a; b도 인스턴스 a를 참조
		//_reference1메소드안에서
		//b에 새로운 인스턴스 선언
		//결과적으로 a,b는 다른 인스턴스를 참조
		//그러므로 a.id는 그대로 1, b.id는 2
		System.out.println("runReference1, "+a.id);
	}
	
	static void _reference2(A b) {
		b.id=2;
	}
	
	static void runReference2() {
		A a = new A(1);//인스턴스a 생성
		_reference2(a);//a가 매개변수로 전달
		//A b = a; 즉 b도 인스턴스 a를 참조
		//b의 id를 바꾸면 a의 id도 바뀜
		System.out.println("runReference2, "+a.id);
	}
	
	public static void main(String[] args) {
		runValue();//1
		runReference1();//1
		runReference2();//2 이게 좀 헷갈릴수있음
	}

}
