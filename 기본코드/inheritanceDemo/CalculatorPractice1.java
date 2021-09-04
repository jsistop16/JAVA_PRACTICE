package org.javatutorials.inheritanceDemo;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) { 
		/*�Ű������� ���� ������
		 * �׷��Ƿ� ��ӵ� �ڽ� Ŭ������ ��ü ���� �ÿ� �⺻�����ڴ� �ڵ����� ȣ��ȵ�
		 * �⺻�����ڸ� �� Ŭ�����ȿ� �߰��� �ִ���
		 * �ƴϸ� �ڽ�Ŭ���� ���� ������ �ȿ� super()�� �����ϵ簡
		 * ���� �ϳ� �ؾ���
		 */
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class Substraction extends Calculator{
	//���� ��� �߰�
	
	
	public Substraction(int left, int right) {
		
		super(left, right);
	}
	
	public void sum() {//overriding����
		//�θ�Ŭ������ sum�޼ҵ尡 �ƴ� �ڽ�Ŭ������ sum�޼ҵ尡 ����ȴ�
		System.out.println("��������"+(this.left+this.right)+"�Դϴ�");
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

public class CalculatorPractice1 {

	public static void main(String[] args) {
		Substraction c1 = new Substraction(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();
	}

}
