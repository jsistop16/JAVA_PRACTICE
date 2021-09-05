//다형성 예제 자체제작
//카페A,B가있고
//각각 메뉴가 아메리카노, 라떼 2개만 있음
//맛 카페A는 light, 카페 B는 dark
//출력은 각각의 카페에서 주문한 음료가 맛이 어떤지 출력

package org.javatutorials.polymorphism;
//인터페이스 예제

/*interface menu{
	public String americano();
	public String latte();
}

class Ab implements menu{
	public String americano() {
		return "light";
	}
	public String latte() {
		return "light";
	}
}

class Ba implements menu{
	public String americano() {
		return "dark";
	}
	public String latte() {
		return "dark";
	}
}
public class PolymorphismOverloadingDemo2 {

	public static void main(String[] args) {
		Ab obja = new Ab();
		Ba objb = new Ba();
		
		System.out.println(obja.americano());
		System.out.println(obja.latte());
		System.out.println(objb.americano());
		System.out.println(objb.latte());
		
	}

}*/

//다형성 예제
class Menu{
	public void americano();
	public void latte();
}

class CafeA extends Menu{
	public void americano() {
		System.out.println("light");
	}
	public void latte() {
		System.out.println("light");
	}
}

class CafeB extends Menu{
	public void americano() {
		System.out.println("dark");
	}
	public void latte() {
		System.out.println("dark");
	}
}

public class PolymorphismOverloadingDemo2{
	public static void main(String[] args) {
		Menu ca = new CafeA();
		Menu cb = new CafeB();
		
		ca.americano();
		cb.latte();
	}
}