package org.javatutorials.abstractclass;
/* 1��
 * ��� ���� ������ ��� ���� class Apply{ private int a; protected Apply(int i) { a=i; }
 * public void apply() { System.out.println(a); }
 * 
 * }
 * 
 * class Better extends Apply{ private int b; /*������ �ߴ� ���� �θ�Ŭ������ A���� �Ű������� ����
 * �����ڰ� ���� �� Ŭ������ ��ӹ��� B������ A�� �����ڸ� �ڵ����� �����Ҽ����� �ֳĸ� �ڵ������Ǵ� �����ڴ� �Ű������� ���� �⺻�����ڻ�
 * A�� �����ڸ� ���� ������ ������� ����� 2���� 1. AŬ���� �ȿ� �⺻�����ڸ� �߰����ִ� ��� 2. BŬ�����ȿ��� super()Ű���带
 * �̿��Ͽ� AŬ������ �̹� �ִ� �����ڸ� ȣ�����ִ� ��� 2�� ����� ������ ���
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

// 2�� Ŭ���� ���������� ����

/*
 * class classaccess{ static int var1 = 1;//Ŭ�������� int var2 = 2;//�ν��Ͻ�����
 * 
 * static void one() { //Ŭ�����޼ҵ� //System.out.println(var2); //�޼ҵ� ��ü�� ���� //Ŭ����
 * �޼ҵ忡�� var2��� �ν��Ͻ� ������ �����ϴ°� �Ұ� }
 * 
 * void two() { //�ν��Ͻ��޼ҵ� System.out.println(var1); }
 * 
 * static void three() { //Ŭ�����޼ҵ� System.out.println(var1); }
 * 
 * void four() { //�ν��Ͻ��޼ҵ� System.out.println(var2); } }
 * 
 * public class AbstractPractice{
 * 
 * public static void main(String[] args) {
 * 
 * classaccess c1 = new classaccess();
 * 
 * //c1.one();//one�޼ҵ� ��ü�� ���� c1.two();//1��� c1.three();//1��� ��� ������ ������ �ƴϰ�
 * �ν��Ͻ��� Ŭ������ �����ؼ� �ߴ°Ͱ��� �׷��� �ؿ� Ŭ�������� ���� �����ϴ� �ڵ忡���� ��� ����
 * 
 * c1.four();//2��� classaccess.three();//Ŭ�������� ���� ���� 1���
 * 
 * } }
 */

//3�� �߻�Ŭ���� ����

abstract class Animal{
	int heart = 1;
	String mind = "yes";
	
	abstract void crying();
	//�������� �����Ҹ��� �ٸ�
	//�������̵� ���
	void question1() {
		//������ ����Ư¡: ����1��
		System.out.println("heart: " + heart);
	}
	void question2() {
		//������ ����Ư¡: ������ �ִ�.
		System.out.println("mind: " + mind);
	}
}

class Tiger extends Animal{
	void crying() {
	
		System.out.println("tiger");//�������̵�
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


//�̻� 3���� ������ �������������, Ŭ��������������, �߻�Ŭ������
//�����غ��Ҵ�.