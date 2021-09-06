package org.javatutorials.exception;

class CalculatorDivide{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("�������");
			System.out.println(this.left/this.right);//�����߻�����
			//�ٷ� catch������ �Ѿ
			System.out.println("�Դϴ�.");		
		}
		catch(Exception e) {
			//Exception�̶�� Ŭ����Ÿ���� e��� ��ü�� �Ű������� ��
			//1
			System.out.println("�����߻�: "+ e.getMessage()+"\n\n");
			//Exception�̶�� Ŭ�����ȿ� getMessage��� �޼ҵ� ����
			//������ ���� ������ ���ϵǴ� �޼ҵ�
			//2
			System.out.println(e.toString()+"\n\n");
			//3
			e.printStackTrace();
			//��3���� catch���
			//��� ������ ���� ������ ����ϴµ� �Ʒ��� ������ �� ������
			//�ڼ��ϰ� �������ִ� �޼ҵ�
		}
		System.out.println("�̰� ����� �ǳ�?");
		//���� ������ catch�� ������ �״��� ���� ����
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		CalculatorDivide c1 = new CalculatorDivide();
		c1.setOperands(10,0);
		c1.divide();
	}

}
