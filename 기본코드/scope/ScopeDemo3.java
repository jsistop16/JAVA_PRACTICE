package org.javatutorials.scope;


class C{
	static int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		//m�޼ҵ� �ȿ� �������� v���
		System.out.println(this.v);
		//�������� v=10�� ���
	}
}

public class ScopeDemo3 {
	
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
