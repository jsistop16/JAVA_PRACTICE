package org.javatutorials.interfaces;

class Calculatormojo implements Calculatable{
	//Calculatormojo는 가짜 코드
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
		/*나중에 Calculator.java 파일 코드가 완성되면
		 * 클래스 타입을 Calculator로 바꾸고 
		 * 실행하면 인터페이스의 활용 목적이 충족되는것
		 * 즉 Calculatormojo라는 장치를 걸어두고
		 * 코드가 모두 완성이되면 그 장치를 풀어줌으로써 완성
		 * 굳이 왜 이러냐 생각이 들수 있음
		 * 걍 인터페이스 구현하지말고
		 * 처음부터 sum, avg함수를 제대로 작성하면 되지 않나?
		 * CalculatorConsumer라는 코드와
		 * Calculator라는 코드의 개발자가
		 * 서로 다르다고 생각하면 이해가 됨
		 * 두 코드를 두 개발자가 각각 개발하면
		 * 프로젝트 시간이 더 줄어드는것
		 * 실무에서는 훨씬더 코드가 복잡하다고 생각해야함
		 * 다시말해서
		 * CalculatorConsumer라는 코드는 사용자가 사용하는 부분만 코딩한것이고
		 * Calculator라는 코드는 실제 계산기가 돌아가는 부분을 코딩한것이고
		 * 이 두 코드를 두 개발자가 동시에 개발하려면 의사소통의 필요성이 생길것이고
		 * 그 의사소통의 규칙을 인터페이스라고 생각하면 된다.
		 */
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}

}
