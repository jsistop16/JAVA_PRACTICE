package org.javatutorials.progenitor;

class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		/*매개변수로 들어오는 s2의 클래스타입은 Student이지만
		 * 실제 매개변수 obj의 타입은 Object이다.
		 * Student클래스의 부모가 Object클래스인 관계이다.
		 * 즉 자식 데이터타입이 부모데이터타입 시늉을 해야함
		 * 우리는 equals라는 메소드를 오버라이딩해주는것
		 * 밑에 메인메소드에서 입력받은 매개변수의 문자열이 같으면
		 * 두 인스턴스는 같다고 출력해주는 equals메소드를 만들고있는것
		 * 즉 지금 이 메소드에서 Object obj라는 매개변수(인스턴스)에서
		 * name이라는 변수에 접근해야함
		 * 그런데 Object클래스타입에서 Student클래스의 변수인 name에
		 * 접근하는것이 불가능하므로 s1,s2라는 Object인스턴스를
		 * Student클래스타입으로 변환해줘야함
		 */
		Student s = (Student)obj;//부모인 Object를 자식인 Student로 바꿈
		/*자식을 부모로 바꾸는건 캐스팅없이 자동으로가능
		 * 하지만 부모를 자식으로 바꾸는건 위 코드처럼 캐스팅 필요
		 * 큰->작은것으로 변하는것이기때문에 수동으로 캐스팅해줘야한다고 생각
		 */
		return this.name==s.name;
		//s1의 name : this.name
		//s2의 name : s.name
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
