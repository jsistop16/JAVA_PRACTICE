package org.javatutorials.exception;

class CalculatorDivide{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);//오류발생구간
			//바로 catch문으로 넘어감
			System.out.println("입니다.");		
		}
		catch(Exception e) {
			//Exception이라는 클래스타입의 e라는 객체를 매개변수로 함
			//1
			System.out.println("오류발생: "+ e.getMessage()+"\n\n");
			//Exception이라는 클래스안에 getMessage라는 메소드 존재
			//에러에 대한 이유가 리턴되는 메소드
			//2
			System.out.println(e.toString()+"\n\n");
			//3
			e.printStackTrace();
			//총3가지 catch방법
			//모두 오류에 대한 내용을 명시하는데 아래로 갈수록 그 이유를
			//자세하게 설명해주는 메소드
		}
		System.out.println("이게 출력이 되나?");
		//오류 설명을 catch로 끝내면 그다음 문장 실행
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		CalculatorDivide c1 = new CalculatorDivide();
		c1.setOperands(10,0);
		c1.divide();
	}

}
