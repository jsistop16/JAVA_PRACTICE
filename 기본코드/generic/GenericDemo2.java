package org.javatutorials.generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}


class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person{
	public Object info;
	//클래스타입이 Object인 이유
	//StudentInfo와 EmployeeInfo모두를 담을 info라는 변수이므로
	//이 두 클래스의 공통조상인 Object를 클래스타입으로 받은것
	//어려움
	Person(Object info){
		this.info = info;
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		Person p1 = new Person("부장");
		/*생성자에서 매개변수로 "부장"이라는 String형 데이터가 들어가는데
		 * 오류가 발생하지 않음
		 * Person이라는 클래스타입의 생성자의 매개변수는 Object클래스타입임
		 * 즉 info라는 변수를 Object로 받게되면서 객체를 생성할때
		 * String형 데이터도 받을수있게되버린것(모든 데이터타입 가능)
		 * 이것을 "타입이 안전하지 않다"라고 표현함
		 * 이것은 자바에서 허용될수 없는 일
		 * 그래서 generic이 쓰임
		 * 즉 제네릭은 코드의 중복과 타입의 안정성 두마리 토끼를 잡는 기술
		 */
		EmployeeInfo ei = (EmployeeInfo) p1.info;
		System.out.println(ei.rank);
	}

}
