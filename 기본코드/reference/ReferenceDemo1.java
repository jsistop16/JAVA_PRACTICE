package org.javatutorials.reference;

class A{
	public int id;
	A(int id){
		this.id = id;
	}
}

public class ReferenceDemo1 {

	public static void runValue() {
		//call by value
		//�⺻������ Ÿ�� int�� ���� ����
		int a = 1;
		
		int b = a;
		//���� a�� ���ִ� ��1�� "����"�ؼ� b�� ����
		b = 2;
		System.out.println("runValue, "+a);//1���
	}
	
	public static void runReference() {
		//call by reference
		//new�� ���� ������������Ÿ�Կ� ���� ����
		A a = new A(1);
		//A�� �ν��Ͻ��� ���� ��ġ ������ ���� a�� ����Ȼ���
		A b = a;
		//����b���� ���� ��ġ ������ ����Ǵ°�(��ġ����=����)
		//a,b�Ѵ� ���� �ν��Ͻ��� �����ϰ��ִ°�
		b.id = 2;
		//�� ��ġ������ �ִ� id���� 2�� �����ϰ� �Ǵ°�
		//a,b�Ѵ� ���� �ν��Ͻ��� ������ ����
		//������ ������ ���̿� ���� �����ؾ���
		System.out.println("runReference, " + a.id);//2���
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
	}

}
