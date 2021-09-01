package org.javatutorials.accessmodifier;

class Calculator{
	private int left, right;
	//���� left, right�� �ܺο��� ���� �Ұ�
	//����ڰ� ������ ���������� �����Ҽ� ����
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int sum() {
		//Ŭ���� ���ο����� ���ٰ����ϰ� �ϹǷν�
		//�ܺο����� �������κ��� ������ ����
		return this.left+this.right;
	}

	
	public void sumDecoPlus() {
		System.out.println("++++"+sum()+"++++");
	}
	public void sumDecoMinus() {
		System.out.println("----"+sum()+"----");
	}
}

public class CalculatorAccessDemo {
 
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10,20);
		//c1.left = 30; 
		//left�� private���� ����Ǿ����Ƿ� ���� �ܺο��� ���� �Ұ�
		c1.sumDecoPlus();
		c1.sumDecoMinus();
		
		/*���������� ����
		 * private:���� Ŭ���� ��
		 * ����: ���� ��Ű�� ��(default)
		 * protected: ���� ��Ű�� �� + �ٸ� ��Ű���� �ڼ� Ŭ����
		 * public: ���Ѿ���
		 */
		
	}

}
