package org.javatutorials.exception;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		if (right == 0) {
			throw new ArithmeticException("0���� �����������ϴ�.");
		}
		try {
			System.out.println("�������� ");
			System.out.println(this.left / this.right);
			System.out.println("�Դϴ�.");
		}
		catch(Exception e) {
			System.out.println("��������: "+ e.getMessage());
			System.out.println("��������: "+ e.toString());
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
