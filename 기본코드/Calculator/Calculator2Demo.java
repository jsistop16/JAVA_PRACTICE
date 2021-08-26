package org.javatutorials.calculator;

class Calculator2 {
	//Ŭ���� ����
	static double PI=3.14;
	/*��� �ν��Ͻ��� �Ȱ��� �������ϴ� ����
	 * �Ź� �ν��Ͻ����� �������ָ� ������ �ߺ��� �Ͼ ���ʿ�
	 * Ŭ������ ������ ����: ��� �ν��Ͻ����� ���������� ����������
	 * static�̶�� Ű���� ����
	 * static�� ��:Ŭ������ ���ϴ� ������ �ȴٴ� ��
	 * static�� �ν��Ͻ� �������� ��������
	 * ���� �Ұ��ϰ� �Ϸ��� static ��� final�� �ٿ�����
	 */
	int left, right;
	/* static�� �Ⱥٿ��� �����Ƿ�
	 * left�� right�� Ŭ���������� �ƴ϶� �ν��Ͻ� ������ �� ���
	 * �ؿ� �ִ� this Ű����� �Բ� �����ؾ���
	 */
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class Calculator2Demo{
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		System.out.println(c1.PI);
		
		Calculator2 c2 = new Calculator2();
		System.out.println(c2.PI);
		
		System.out.println(Calculator2.PI);
	}
}
