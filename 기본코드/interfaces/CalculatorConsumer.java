package org.javatutorials.interfaces;

class Calculatormojo implements Calculatable{
	//Calculatormojo�� ��¥ �ڵ�
	public void setOperands(int first, int second, int third) {
		
	}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer {

	public static void main(String[] args) {
		Calculatormojo c = new Calculatormojo();
		/*���߿� Calculator.java ���� �ڵ尡 �ϼ��Ǹ�
		 * Ŭ���� Ÿ���� Calculator�� �ٲٰ� 
		 * �����ϸ� �������̽��� Ȱ�� ������ �����Ǵ°�
		 * �� Calculatormojo��� ��ġ�� �ɾ�ΰ�
		 * �ڵ尡 ��� �ϼ��̵Ǹ� �� ��ġ�� Ǯ�������ν� �ϼ�
		 * ���� �� �̷��� ������ ��� ����
		 * �� �������̽� ������������
		 * ó������ sum, avg�Լ��� ����� �ۼ��ϸ� ���� �ʳ�?
		 * CalculatorConsumer��� �ڵ��
		 * Calculator��� �ڵ��� �����ڰ�
		 * ���� �ٸ��ٰ� �����ϸ� ���ذ� ��
		 * �� �ڵ带 �� �����ڰ� ���� �����ϸ�
		 * ������Ʈ �ð��� �� �پ��°�
		 * �ǹ������� �ξ��� �ڵ尡 �����ϴٰ� �����ؾ���
		 * �ٽø��ؼ�
		 * CalculatorConsumer��� �ڵ�� ����ڰ� ����ϴ� �κи� �ڵ��Ѱ��̰�
		 * Calculator��� �ڵ�� ���� ���Ⱑ ���ư��� �κ��� �ڵ��Ѱ��̰�
		 * �� �� �ڵ带 �� �����ڰ� ���ÿ� �����Ϸ��� �ǻ������ �ʿ伺�� ������̰�
		 * �� �ǻ������ ��Ģ�� �������̽���� �����ϸ� �ȴ�.
		 */
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}

}
