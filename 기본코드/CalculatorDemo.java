package org.javatutorials.calculator;

public class CalculatorDemo {
	
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void add() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	public static void main(String[] args) {
		
		CalculatorDemo c1 = new CalculatorDemo();
		c1.setOperands(10,20);
		c1.add();
		c1.avg();
		
		CalculatorDemo c2 = new CalculatorDemo();
		c2.setOperands(20,40);
		c2.add();
		c2.avg();
	}
	

}
