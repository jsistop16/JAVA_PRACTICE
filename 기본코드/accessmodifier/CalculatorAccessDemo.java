package org.javatutorials.accessmodifier;

class Calculator{
	private int left, right;
	//변수 left, right는 외부에서 접근 불가
	//사용자가 변수를 자의적으로 변경할수 없음
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int sum() {
		//클래스 내부에서만 접근가능하게 하므로써
		//외부에서의 접근으로부터 안정성 보장
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
		//left는 private으로 선언되었으므로 오류 외부에서 접근 불가
		c1.sumDecoPlus();
		c1.sumDecoMinus();
		
		/*접근제어자 정리
		 * private:같은 클래스 내
		 * 없음: 같은 패키지 내(default)
		 * protected: 같은 패키지 내 + 다른 패키지의 자손 클래스
		 * public: 제한없음
		 */
		
	}

}
