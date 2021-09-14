package org.javatutorials.reference;

public class ReferenceDemo2 {
	
	static void _value(int b) {
		b=2;
	}
	
	static void runValue() {
		int a=1;
		_value(a);
		System.out.println("runValue, "+a);
	}
	
	static void _reference1(A b) {
		b = new A(2);
	}
	
	static void runReference1() {
		A a = new A(1);//�ν��Ͻ� a ����
		_reference1(a);//a�� �Ű������� ����
		//A b = a; b�� �ν��Ͻ� a�� ����
		//_reference1�޼ҵ�ȿ���
		//b�� ���ο� �ν��Ͻ� ����
		//��������� a,b�� �ٸ� �ν��Ͻ��� ����
		//�׷��Ƿ� a.id�� �״�� 1, b.id�� 2
		System.out.println("runReference1, "+a.id);
	}
	
	static void _reference2(A b) {
		b.id=2;
	}
	
	static void runReference2() {
		A a = new A(1);//�ν��Ͻ�a ����
		_reference2(a);//a�� �Ű������� ����
		//A b = a; �� b�� �ν��Ͻ� a�� ����
		//b�� id�� �ٲٸ� a�� id�� �ٲ�
		System.out.println("runReference2, "+a.id);
	}
	
	public static void main(String[] args) {
		runValue();//1
		runReference1();//1
		runReference2();//2 �̰� �� �򰥸�������
	}

}
