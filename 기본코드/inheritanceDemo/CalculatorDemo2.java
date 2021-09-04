package org.javatutorials.inheritanceDemo;


class MultiplicableCalculator extends Calculator_demo{
	//하위클래스
	
	public MultiplicableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void multiple() {
		System.out.println(this.left*this.right);
	}
}


public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultiplicableCalculator c1 = new MultiplicableCalculator(10, 20);
		c1.multiple();
		c1.sum();
		c1.avg();

	}

}
