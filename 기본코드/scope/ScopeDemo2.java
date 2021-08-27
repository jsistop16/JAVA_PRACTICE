package org.javatutorials.scope;

public class ScopeDemo2 {

	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		//int i = 30;
		System.out.println(i);
		//전역변수i를 가져옴
		//출력값 5
		//하지만 위줄 코드(int i = 30;)처럼 지역변수 i를 30으로 선언해주면
		//30이 출력된다
		//b라는 메소드안에서 선언된 i는 지역변수로
		//유효범위에 포함되는것이다.
		//만약 메소드b안에 있는 지역변수도 없고
		//클래스안에서의 전역변수도 없다면 오류나옴
		/*그렇다면 전역변수로 다 설정하면 되지 왜 지역변수를 메소드안에 추가하는가
		*그 이유는 클래스안에 메소드가 여러개일때
		*특정 메소드의 변수에만 따로 값을 저장할떄 지역변수를
		*사용한다 이떄 유용하기 떄문이다.
		*/
	}
	
	public static void main(String[] args) {
		int i = 1;
		a();
	}

}
