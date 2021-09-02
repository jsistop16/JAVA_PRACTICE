package org.javatutorials.abstractclass;

abstract class A{
	//클래스 멤버(메소드)중에 하나라도 abstract라면
	//그 클래스 역시 abstract임
	public abstract void b();
	/*public abstract int c() {
		System.out.println("Hello");
		//에러: abstract으로 선언된 c라는 메소드 안에
		//구체적인 로직이 들어가있음
		//추상메소드는 그 안에 내용이 들어갈수없음
		//위에 b메소드 처럼 중괄호가 아예없어야함
	}*/
	public void d() {
		/*추상 클래스 A는 메소드 d처럼 본체(중괄호)를 가지는
		 * 메소드를 가질수 있음
		 */
		System.out.println("world");
	}
}

class B extends A{
	public void b() {
		//추상메소드인 b를 오버라이드
		System.out.println("world");
		/*A클래스에서 b메소드의 내용을 지정하지 못했기떄문에
		 * A를 상속받은 클래스 B에서 메소드 b에 대한 본체를
		 * 구성해줘야 함
		 */
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		//A obj = new A();
		//추상 클래스 A는 객체 생성 불가
		B obj = new B();
		//상속받은 B클래스의 객체 생성
		obj.b();
		obj.d();
	}

}

//왜 굳이 abstract라는 키워드를 사용해서 꼭 
//상속을 받아야만 사용가능한 클래스를 사용하는것인가?
//귀찮게
//공통된부분은 추상클래스에 넣어두고 각각의 기능이 달라야하는부분은
//추상메소드 오버라이딩을 통해 첨가해주면 되는것이다.