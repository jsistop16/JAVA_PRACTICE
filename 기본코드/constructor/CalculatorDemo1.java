package org.javatutorials.constructor;

class Calculator{
	int left, right;//A영역이라고 가정
	
	public Calculator(int left, int right) {//클래스와 같은이름의 메소드
		//생성자
		//클래스안의 어떠한 메소드보다 항상 먼저 실행됨.
		//즉 항상 먼저 초기화가 진행된다는 뜻
		this.left = left;//A영역의 left값에 매개변수 left값을 저장
		this.right = right;
	}
	
	public  void sum() {
		System.out.println(this.left + this.right);
		//A영역의 left값, right값을 가져옴
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10,20);
		/*Calculator(10,20)은 정확히 말하면 생성자
		 * 좌변 c1은 인스턴스
		 */
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
	}

}
