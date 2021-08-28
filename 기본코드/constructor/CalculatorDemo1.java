package org.javatutorials.constructor;

class Calculator{
	int left, right;//A�����̶�� ����
	
	public Calculator(int left, int right) {//Ŭ������ �����̸��� �޼ҵ�
		//������
		//Ŭ�������� ��� �޼ҵ庸�� �׻� ���� �����.
		//�� �׻� ���� �ʱ�ȭ�� ����ȴٴ� ��
		this.left = left;//A������ left���� �Ű����� left���� ����
		this.right = right;
	}
	
	public  void sum() {
		System.out.println(this.left + this.right);
		//A������ left��, right���� ������
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10,20);
		/*Calculator(10,20)�� ��Ȯ�� ���ϸ� ������
		 * �º� c1�� �ν��Ͻ�
		 */
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
	}

}
