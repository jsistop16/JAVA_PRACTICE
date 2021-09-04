package org.javatutorials.inheritanceDemo;

class Calculator_demo {
	int left, right;
	

	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
		
	}
}


class SubstractionableCalculator extends Calculator_demo{
	
	public SubstractionableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class CalculatorDemo1{
	public static void main (String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(30, 60);
		c1.substract();
		c1.sum();
		c1.avg();
	}
}