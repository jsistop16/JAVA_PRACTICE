package org.javatutorials.scope;
//유효범위(scope)알아보기
public class ScopeDemo {
	static int i;
	//전역변수(global variable)
	//변수 선언
	//이 코드에서 i는 전역변수
	static void a() {//클래스메소드
		i = 0;
		//변수 할당
		//a라는 메소드안에서 선언된 i라는 변수는 메소드a안에서만 효력을 가짐
		//그러므로 밑에 메인함수 안에 for문에서는 i값이 0으로 다시 초기화 되는
		//일은 없는것
		//만약 i가 a메소드에 의해 0으로 계속 초기화 된다면 
		//for문은 무한반복이 될것임
		//int k = 5;
		//이때 k는 지역변수(local variable)
		//변수 선언+할당
		//메소드안에 선언된 변수는 지역변수
	}
	
	public static void main(String[] args) {
		for (i=0; i<5; i++) {
			a();
			System.out.println(i);
		}
		
	}

}
