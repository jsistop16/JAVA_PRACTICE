package org.javatutorials.inheritanceDemo1;

class DivisionCalculator extends MultiplicableCalculator{
	public void division() {
		System.out.println(this.left / this.right);
	}
}


public class CalculatorDemo3 {

	public static void main(String[] args) {
		
		DivisionCalculator c1 = new DivisionCalculator();
		c1.setOperands(30,10);
		c1.division();
		c1.multiple();
	}

}
