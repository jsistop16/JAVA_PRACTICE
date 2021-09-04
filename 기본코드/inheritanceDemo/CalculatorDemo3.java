package org.javatutorials.inheritanceDemo;

class DivisionCalculator extends MultiplicableCalculator{
	
	public DivisionCalculator(int left, int right) {
		super(left, right);
	}
	public void division() {
		System.out.println(this.left / this.right); 
	}
}


public class CalculatorDemo3 {

	public static void main(String[] args) {
		
		DivisionCalculator c1 = new DivisionCalculator(30, 10);
		c1.division();
		c1.multiple();
	}

}
