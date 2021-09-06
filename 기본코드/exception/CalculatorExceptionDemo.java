package org.javatutorials.exception;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		if (right == 0) {
			throw new ArithmeticException("0으로 나눌수없습니다.");
		}
		try {
			System.out.println("실행결과는 ");
			System.out.println(this.left / this.right);
			System.out.println("입니다.");
		}
		catch(Exception e) {
			System.out.println("오류내용: "+ e.getMessage());
			System.out.println("오류내용: "+ e.toString());
			e.printStackTrace();
		} 
	}
}

public class CalculatorExceptionDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		try {
			c1.divide();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}

}
