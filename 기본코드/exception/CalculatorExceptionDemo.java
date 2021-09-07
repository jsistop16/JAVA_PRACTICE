package org.javatutorials.exception;

class DivideException extends RuntimeException{//��������� ���� 
	
	int left, right;
	
	DivideException(){
		super();
	}
	
	DivideException(String message){
		super(message);
	}
	
	DivideException(String message, int left, int right){
		//��������� ���ܿ� Ư���� ����� �߰��Ҽ�������
		//� ������ ���ؼ� DivideException�� �߻��ߴ���
		//������ִ� ������
		super(message);
		this.left = left;
		this.right = right;
	}
	
}

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() throws DivideException {
		if (right == 0) {
			throw new DivideException("0���� �����������ϴ�.", left, right);//��
		}
		System.out.println(this.left / this.right);
	}
}

public class CalculatorExceptionDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		try {
			c1.divide();
		}
		catch(DivideException e){//������ ����� ���ܰ� ���޵�
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}

}
