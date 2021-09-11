package org.javatutorials.constant;
//enum:������
//���� ������ ������� ����
/*enum�� ó������ ������� ������ �����ִ� ������� �����̱� ������
 * public static final Fruit APPLE = new Fruit();ó��
 * ��� �������ؼ� �ۼ��Ѱ��� �𸣴� ���� ������ ����
 * ��ü�� �����ϴ� ���������δ� ������ ������ ��
 * �ٵ� enum�� �׷����� ���ٴ� ��
 * enum�� ��ǻ� Ŭ������ ����
 */
enum Fruit1{
	APPLE, PEACH, BANANA;
	//public static final Fruit APPLE = new Fruit();
	//�� ���� �ǹ̸� APPLE�� ���� ����,
	//PEACH, BANANA�� ���� �ǹ�
	Fruit1(){//������
		System.out.println("constructor call");
		//�� 3�� ��µ�
		//�������� �����ڰ� �ѹ��� ȣ��Ǳ� ����
		//enum���� �����̸��� �����ϴ� ������
		//�� �ν��Ͻ��� �����ϴ� ������ ������ �ǹ�
		//�ֳ��ϸ� �ν��Ͻ��� �����ҋ����� �����ڰ� ȣ��Ǳ⋚��
	}
}

enum Company1{
	GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo3 {
	
	public static void main(String[] args) {
		Fruit1 type = Fruit1.APPLE; 
		//enum�� ������ ����� �Ҽ����⋚����
		//�� �ڵ�� ���� ����ϵ��� �������ִ°�
		switch(type) {
		case APPLE:
			//case�ڿ� �κ��� ���̺��̶�� �ϴµ�
			//enum���� �������� APPLE�̱� ������
			//���̺��� Fruit.APPLE�̶�� ����� ��
			//�׳� APPLE�̶�� �������
			System.out.println(57+"kcal");
			break;
		case PEACH:
			System.out.println(34+"kcal");
			break;
		case BANANA:
			System.out.println(93+"kcal");
			break;
		}
	}

}
