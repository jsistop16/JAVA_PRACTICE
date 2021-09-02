package org.javatutorials.abstractclass;

abstract class Calculator{
	int left, right;
	public void setOperands(int left, int right) {
		//공통부분은 부모클래스에서 정의
		this.left = left;
		this.right = right;
	}
	public int realsum() {
		return (this.left+this.right);
	}
	public int realavg() {
		return ((this.left+this.right)/2);
	}
	
	
	public abstract void sum();//2번
	public abstract void avg();
	public void run() {
		sum();//1번
		avg();
	}
}

class PlusCalculator extends Calculator{
	public void sum() {
		//추상메소드 직접 구현
		//3번 순서로 따라감
		System.out.println("+sum : "+realsum());
	}
	public void avg() {
		//추상메소드 직접 구현
		System.out.println("+avg : "+realavg());
	}
}

class MinusCalculator extends Calculator{
	public void sum() {
		//추상메소드 직접 구현
		System.out.println("-sum : "+realsum());
	}
	public void avg() {
		//추상메소드 직접 구현
		System.out.println("-avg : "+realavg());
	}
}



public class AbstractCalculator {

	public static void main(String[] args) {
		PlusCalculator c1 = new PlusCalculator();
		c1.setOperands(10,20);
		//setOperands메소드는 하위클래스(PlusCalculator에 없으므로
		//알아서 부모클래스(Calculator)에 있는지 확인함 있음
		c1.run();
		//run메소드도 마찬가지로 하위클래스에 없으므로 부모클래스에서 찾음
		
		MinusCalculator c2 = new MinusCalculator();
		c2.setOperands(30,50);
		c2.run();
	}

}
