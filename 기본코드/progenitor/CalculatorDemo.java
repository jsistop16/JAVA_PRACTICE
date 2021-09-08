package org.javatutorials.progenitor;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	public String toString() {
		return super.toString() + ("left"+this.left + ", right:"+this.right);
		//toString�� �������̵�
		//super.toString()�� �������̵��Ǳ� �� toString�޼ҵ带 ȣ��
		
	}

}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		System.out.println(c1);//�ν��Ͻ� c1�� �ּҰ� ���
		//toString�޼ҵ�� ��� �ڵ� ȣ��� ���ٰ� ���� ���
		System.out.println(c1.toString());//����� ����
		//toString�޼ҵ�� �⺻������ ��ӵǴ� objectŬ������ �ձ⋚���� ȣ�Ⱑ��
		
	}

}
