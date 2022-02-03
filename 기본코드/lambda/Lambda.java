package org.javatutorials.lambda;

public class Lambda {

	public static void main(String[] args) {
//		Myfunction f = new Myfunction() {
//			public int max(int a, int b) {
//				return a>b ? a:b;//람다식은 익명객체
//			}
//		};
		Myfunction f = (a,b)-> a>b ? a:b;
		
		int value = f.max(3,5);
		System.out.println(value);
		/*
		 * obj는 Object의 객체이므로 max메소드가 없음
		 * 그래서 필요한것이 함수형 인터페이스!!
		 */
	}
}
@FunctionalInterface//추상메소드 무조건 1개
interface Myfunction{
	public abstract int max(int a, int b);
}