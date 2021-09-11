package org.javatutorials.constant;
//enum:열거형
//서로 연관된 상수들의 집합
/*enum은 처음부터 만들어진 목적이 관련있는 상수들의 열거이기 때문에
 * public static final Fruit APPLE = new Fruit();처럼
 * 어떤걸 쓰기위해서 작성한건지 모르는 일이 생기지 않음
 * 객체를 생성하는 행위만으로는 뭘할지 아직은 모름
 * 근데 enum은 그럴일이 없다는 뜻
 * enum은 사실상 클래스와 같음
 */
enum Fruit1{
	APPLE, PEACH, BANANA;
	//public static final Fruit APPLE = new Fruit();
	//와 같은 의미를 APPLE로 쉽게 쓴것,
	//PEACH, BANANA도 같은 의미
	Fruit1(){//생성자
		System.out.println("constructor call");
		//총 3번 출력됨
		//변수마다 생성자가 한번씩 호출되기 떄문
		//enum에서 변수이름만 열거하는 행위는
		//곧 인스턴스를 생성하는 행위와 같음을 의미
		//왜냐하면 인스턴스를 생성할떄마다 생성자가 호출되기떄문
	}
}

enum Company1{
	GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo3 {
	
	public static void main(String[] args) {
		Fruit1 type = Fruit1.APPLE; 
		//enum은 생성과 상속을 할수없기떄문에
		//위 코드와 같이 사용하도록 정해져있는것
		switch(type) {
		case APPLE:
			//case뒤에 부분을 레이블이라고 하는데
			//enum으로 선언해준 APPLE이기 떄문에
			//레이블에서 Fruit.APPLE이라고 안적어도 됨
			//그냥 APPLE이라고 적어야함
			System.out.println(57+"kcal");
			break;
		case PEACH:
			System.out.println(34+"kcal");
			break;
		case BANANA:
			System.out.println(93+"kcal");
			break;
		}
	}

}
