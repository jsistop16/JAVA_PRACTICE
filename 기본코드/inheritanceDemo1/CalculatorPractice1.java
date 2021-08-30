package org.javatutorials.inheritanceDemo;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) { 
		/*매개변수를 갖는 생성자
		 * 그러므로 상속된 자식 클래스의 객체 생성 시에 기본생성자는 자동으로 호출안됨
		 * 기본생성자를 이 클래스안에 추가해 주던가
		 * 아니면 자식클래스 안의 생성자 안에 super()를 생성하든가
		 * 둘중 하나 해야함
		 */
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class Substraction extends Calculator{
	public Substraction(int left, int right) {
		
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

public class CalculatorPractice1 {

	public static void main(String[] args) {
		Substraction c1 = new Substraction(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();
	} 

}
