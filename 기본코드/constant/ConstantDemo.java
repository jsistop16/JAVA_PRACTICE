package org.javatutorials.constant;

class Fruit{
	int APPLE=1, PEACH=2, BANANA=3;
}

class COMPANY{
	int APPLE=1, GOOGLE=2, ORACLE=3;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
		int type = Fruit.APPLE;
		
		if (Fruit.APPLE == COMPANY.APPLE) {
			System.out.println("과일애플과 기업애플은 같습니다.");
		}
		//FRUIT.APPLE과 COMPANY.APPLE 비교할 대상이 아예안됨
		//그런데 위 코드는 정상 출력됨
		//이런에러는 나중에 찾기도 힘들어서
		//스스로 견제하는 코드를 짤줄아는게 실력있는 프로그래머
		
		switch(type) {
		case Fruit.APPLE:
			System.out.println(57+"kcal");
			break;
		case Fruit.PEACH:
			System.out.println(34+"kcal");
			break;
		case Fruit.BANANA:
			System.out.println(93+"kcal");
			break;
		}
	}

}
