package org.javatutorials.reference;

class A{
	public int id;
	A(int id){
		this.id = id;
	}
}

public class ReferenceDemo1 {

	public static void runValue() {
		//call by value
		//기본데이터 타입 int에 의한 정의
		int a = 1;
		
		int b = a;
		//변수 a에 들어가있는 값1을 "복제"해서 b에 저장
		b = 2;
		System.out.println("runValue, "+a);//1출력
	}
	
	public static void runReference() {
		//call by reference
		//new로 인한 참조형데이터타입에 의한 정의
		A a = new A(1);
		//A의 인스턴스에 대한 위치 정보를 변수 a에 저장된상태
		A b = a;
		//변수b에도 역시 위치 정보가 저장되는것(위치정보=참조)
		//a,b둘다 같은 인스턴스를 참조하고있는것
		b.id = 2;
		//즉 위치정보에 있는 id값을 2로 변경하게 되는것
		//a,b둘다 같은 인스턴스의 리모컨 역할
		//참조와 복제의 차이에 대해 이해해야함
		System.out.println("runReference, " + a.id);//2출력
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
	}

}
