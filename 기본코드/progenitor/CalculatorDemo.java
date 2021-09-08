package org.javatutorials.progenitor;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	public String toString() {
		return super.toString() + ("left"+this.left + ", right:"+this.right);
		//toString을 오버라이딩
		//super.toString()은 오버라이딩되기 전 toString메소드를 호출
		
	}

}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		System.out.println(c1);//인스턴스 c1의 주소가 출력
		//toString메소드는 없어도 자동 호출됨 밑줄과 같은 결과
		System.out.println(c1.toString());//결과는 같음
		//toString메소드는 기본적으로 상속되는 object클래스가 잇기떄문에 호출가능
		
	}

}
