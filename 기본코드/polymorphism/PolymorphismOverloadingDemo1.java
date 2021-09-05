package org.javatutorials.polymorphism;
//다형성 예제(오버라이딩으로 설명하는게 제일 적합할듯)
class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String x() {//overriding
		return "B.x";
	}
	public String y() {
		return "y";
	}
}


class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismOverloadingDemo1 {

	public static void main(String[] args) {
		//예제1
		A obj = new B();
		/*클래스 B를 obj라는 변수에 인스턴스화 시켰고
		*obj라는 변수의 클래스타입은 A이다.
		*obj는 A행세를 하고있는것
		*/
		obj.x();//A안에 메소드는 정상 실행
		//obj.y();//오류발생 A안에 y메소드 없음
		System.out.println(obj.x());
		//이 문장은 B.x를 반환함
		/*A클래스 행세를 하고있는 obj라서 A에 없는 메소드는 실행불가
		 *하지만 A클래스 안에있는 메소드가 다른클래스에 오버라이딩됐다면
		 *그 오버라이딩된 메소드가 실행된다.
		 */
		
		 //예제2
		A obj2 = new B2();
		/*obj2는 A의 인스턴스라고 간주
		 * A에 있는 메소드 x()만 실행가능
		 * 하지만 B2에서 x()메소드가 오버라이딩됨
		 * 그러므로 A의 인스턴스이지만 B2의 메소드가 실행됨
		 */
		System.out.println(obj2.x());
		//그러므로 B2.x가 출력됨
	}

}
