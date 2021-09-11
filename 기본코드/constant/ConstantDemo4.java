package org.javatutorials.constant;
//enum을 클래스처럼 사용해보기
enum Fruit2{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit2(String color){//생성자
		System.out.println("Call Constructor"+this);
		this.color = color;
	}
}

public class ConstantDemo4 {

	public static void main(String[] args) {
		Fruit2 type = Fruit2.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(47+"kcal, color :"+Fruit2.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(93+"kcal, color :"+Fruit2.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(35+"kcal, color :"+Fruit2.BANANA.getColor());
			break;
		}
		
		for (Fruit2 f : Fruit2.values()) {
			//enum으로 선언했기때문에 배열처럼 인식되서
			//원소(values)를 하나씩 출력할수도있음
			System.out.println(f);
		}
	}

}
