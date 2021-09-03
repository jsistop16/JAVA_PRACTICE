package org.javatutorials.abstractclass;
/* 1번
 * 멤버 접근 제어자 상속 연습 class Apply{ private int a; protected Apply(int i) { a=i; }
 * public void apply() { System.out.println(a); }
 * 
 * }
 * 
 * class Better extends Apply{ private int b; /*에러가 뜨는 이유 부모클래스인 A에서 매개변수가 없는
 * 생성자가 없음 그 클래스를 상속받은 B에서는 A의 생성자를 자동으로 생성할수없음 왜냐면 자동생성되는 생성자는 매개변수가 없는 기본생성자뿐
 * A의 생성자를 따로 설정을 해줘야함 방법은 2가지 1. A클래스 안에 기본생성자를 추가해주는 방식 2. B클래스안에서 super()키워드를
 * 이용하여 A클래스에 이미 있는 생성자를 호출해주는 방식 2번 방식이 보편적 방법
 * 
 * public Better() { super(10); b=1; }
 * 
 * public void better() {
 * 
 * System.out.println(b); } }
 * 
 * 
 * 
 * public class AbstractPractice {
 * 
 * public static void main(String[] args) { Better b = new Better(); b.better();
 * b.apply(); }
 * 
 * 
 * }
 */

// 2번 클래스 접근제어자 연습

/*
 * class classaccess{ static int var1 = 1;//클래스변수 int var2 = 2;//인스턴스변수
 * 
 * static void one() { //클래스메소드 //System.out.println(var2); //메소드 자체가 에러 //클래스
 * 메소드에서 var2라는 인스턴스 변수에 접근하는게 불가 }
 * 
 * void two() { //인스턴스메소드 System.out.println(var1); }
 * 
 * static void three() { //클래스메소드 System.out.println(var1); }
 * 
 * void four() { //인스턴스메소드 System.out.println(var2); } }
 * 
 * public class AbstractPractice{
 * 
 * public static void main(String[] args) {
 * 
 * classaccess c1 = new classaccess();
 * 
 * //c1.one();//one메소드 자체가 오류 c1.two();//1출력 c1.three();//1출력 경고문 이유는 오류는 아니고
 * 인스턴스가 클래스에 접근해서 뜨는것같음 그래서 밑에 클래스에서 직접 접근하는 코드에서는 경고문 없음
 * 
 * c1.four();//2출력 classaccess.three();//클래스에서 직접 접근 1출력
 * 
 * } }
 */

//3번 추상클래스 연습

abstract class Animal{
	int heart = 1;
	String mind = "yes";
	
	abstract void crying();
	//동물마다 울음소리는 다름
	//오버라이딩 대상
	void question1() {
		//동물의 공통특징: 심장1개
		System.out.println("heart: " + heart);
	}
	void question2() {
		//동물의 공통특징: 감정이 있다.
		System.out.println("mind: " + mind);
	}
}

class Tiger extends Animal{
	void crying() {
	
		System.out.println("tiger");//오버라이딩
	}
}

public class AbstractPractice{
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.crying();
		tiger.question1();
		tiger.question2();
		
		
	}
}


//이상 3가지 예제로 멤버접근제어자, 클래스접근제어자, 추상클래스를
//복습해보았다.