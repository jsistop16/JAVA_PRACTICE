package org.javatutorials.lambda;

public class Lambda {

	public static void main(String[] args) {
//		Myfunction f = new Myfunction() {
//			public int max(int a, int b) {
//				return a>b ? a:b;//���ٽ��� �͸�ü
//			}
//		};
		Myfunction f = (a,b)-> a>b ? a:b;
		
		int value = f.max(3,5);
		System.out.println(value);
		/*
		 * obj�� Object�� ��ü�̹Ƿ� max�޼ҵ尡 ����
		 * �׷��� �ʿ��Ѱ��� �Լ��� �������̽�!!
		 */
	}
}
@FunctionalInterface//�߻�޼ҵ� ������ 1��
interface Myfunction{
	public abstract int max(int a, int b);
}