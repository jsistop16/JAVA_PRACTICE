package org.javatutorials.calculator;

class Calculator2 {
	//클래스 변수
	static double PI=3.14;
	/*모든 인스턴스가 똑같이 가져야하는 변수
	 * 매번 인스턴스에서 선언해주면 데이터 중복이 일어남 불필요
	 * 클래스의 변수의 목적: 모든 인스턴스에서 공통적으로 가질수있음
	 * static이라는 키워드 존재
	 * static의 뜻:클래스에 속하는 변수가 된다는 뜻
	 * static은 인스턴스 구간에서 수정가능
	 * 수정 불가하게 하려면 static 대신 final을 붙여햐함
	 */
	int left, right;
	/* static이 안붙여져 있으므로
	 * left와 right는 클래스변수가 아니라 인스턴스 변수가 될 운명
	 * 밑에 있는 this 키워드와 함께 이해해야함
	 */
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class Calculator2Demo{
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		System.out.println(c1.PI);
		
		Calculator2 c2 = new Calculator2();
		System.out.println(c2.PI);
		
		System.out.println(Calculator2.PI);
	}
}
