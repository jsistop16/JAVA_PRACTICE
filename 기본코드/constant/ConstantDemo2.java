package org.javatutorials.constant;

class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}

class Company{
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		
		if (Fruit.APPLE == Company.APPLE) {
			//두개의 클래스타입이 각각 Fruit과 Company로 다르기떄문에 에러 발생
			System.out.println("과일애플과 기업애플은 같습니다.");
		}
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		//type의 타입이 Fruit이므로 switch문에 들어갈수없는
		//타입이기 때문에 오류발생
		//이것의 해결책은 enum
		//ConstantDemo3
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
