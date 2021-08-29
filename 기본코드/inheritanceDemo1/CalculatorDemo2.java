package org.javatutorials.inheritanceDemo1;

class MultiplicableCalculator extends Calculator{
	public void multiple() {
		System.out.println(this.left*this.right);
	}
}


public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultiplicableCalculator c1 = new MultiplicableCalculator();
		c1.setOperands(10,20);
		c1.multiple();

	}

}
