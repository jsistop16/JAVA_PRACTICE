package org.javatutorials.abstractclass;

abstract class Calculator{
	int left, right;
	public void setOperands(int left, int right) {
		//����κ��� �θ�Ŭ�������� ����
		this.left = left;
		this.right = right;
	}
	public int realsum() {
		return (this.left+this.right);
	}
	public int realavg() {
		return ((this.left+this.right)/2);
	}
	
	
	public abstract void sum();//2��
	public abstract void avg();
	public void run() {
		sum();//1��
		avg();
	}
}

class PlusCalculator extends Calculator{
	public void sum() {
		//�߻�޼ҵ� ���� ����
		//3�� ������ ����
		System.out.println("+sum : "+realsum());
	}
	public void avg() {
		//�߻�޼ҵ� ���� ����
		System.out.println("+avg : "+realavg());
	}
}

class MinusCalculator extends Calculator{
	public void sum() {
		//�߻�޼ҵ� ���� ����
		System.out.println("-sum : "+realsum());
	}
	public void avg() {
		//�߻�޼ҵ� ���� ����
		System.out.println("-avg : "+realavg());
	}
}



public class AbstractCalculator {

	public static void main(String[] args) {
		PlusCalculator c1 = new PlusCalculator();
		c1.setOperands(10,20);
		//setOperands�޼ҵ�� ����Ŭ����(PlusCalculator�� �����Ƿ�
		//�˾Ƽ� �θ�Ŭ����(Calculator)�� �ִ��� Ȯ���� ����
		c1.run();
		//run�޼ҵ嵵 ���������� ����Ŭ������ �����Ƿ� �θ�Ŭ�������� ã��
		
		MinusCalculator c2 = new MinusCalculator();
		c2.setOperands(30,50);
		c2.run();
	}

}
