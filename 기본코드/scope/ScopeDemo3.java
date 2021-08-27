package org.javatutorials.scope;


class C{
	static int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		//m메소드 안에 지역변수 v출력
		System.out.println(this.v);
		//전역변수 v=10을 출력
	}
}

public class ScopeDemo3 {
	
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
