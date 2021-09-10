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
			System.out.println("���Ͼ��ð� ��������� �����ϴ�.");
		}
		//FRUIT.APPLE�� COMPANY.APPLE ���� ����� �ƿ��ȵ�
		//�׷��� �� �ڵ�� ���� ��µ�
		//�̷������� ���߿� ã�⵵ ����
		//������ �����ϴ� �ڵ带 ©�پƴ°� �Ƿ��ִ� ���α׷���
		
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
