package org.javatutorials.exception;

class DivideException extends RuntimeException{//사용자정의 예외 
	
	int left, right;
	
	DivideException(){
		super();
	}
	
	DivideException(String message){
		super(message);
	}
	
	DivideException(String message, int left, int right){
		//사용자정의 예외에 특별한 기능을 추가할수도있음
		//어떤 변수에 의해서 DivideException이 발생했는지
		//출력해주는 생성자
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
			throw new DivideException("0으로 나눌수없습니다.", left, right);//ㄱ
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
		catch(DivideException e){//ㄱ에서 선언된 예외가 전달됨
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}

}
