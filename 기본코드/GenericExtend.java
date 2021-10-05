package org.javatutorials.generic;

abstract class InfoDemo{
	public abstract int getLevel();
	//추상메소드 추후 수정필수
}

class EmployeeInfoDemo extends InfoDemo{
	public int rank;
	EmployeeInfoDemo(int rank){
		//생성자
		this.rank = rank;
	}
	public int getLevel() {
		//추상클래스 내용 수정
		return this.rank;
	}
}

class Person<T extends InfoDemo>{
	//T라는 데이터타입은 InfoDemo의 자식데이터 타입만 가능하게끔 강제
	//InfoDemo의 자식 = EmployeeInfoDemo
	public T info;
	Person(T info){
		this.info = info;
	}
}

public class GenericExtend {

	public static void main(String[] args) {
		Person<EmployeeInfoDemo> p1 = new Person<EmployeeInfoDemo>(new EmployeeInfoDemo(1));
		//제네릭 실제 사용법: 인스턴스화 할때 데이터 타입을 정해주는것(사용법이자 사용목적이기도 함)
		//그러다보니 온갖 데이터 타입이 다 들어올수있는 문제점이 있음
		//그래서 extends라는 키워드를 이용하여 데이터 타입을 제한해줄수 있는것
		//EmployeeInfoDemo는 InfoDemo의 자식이므로 가능
		/*Person<String> p2 = new Person<String>("부장");*/
		//String은 InfoDemo의 자식타입이 아니므로 compile error
		System.out.println(p1.info);
	}

}
