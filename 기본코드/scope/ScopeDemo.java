package org.javatutorials.scope;
//��ȿ����(scope)�˾ƺ���
public class ScopeDemo {
	static int i;
	//��������(global variable)
	//���� ����
	//�� �ڵ忡�� i�� ��������
	static void a() {//Ŭ�����޼ҵ�
		i = 0;
		//���� �Ҵ�
		//a��� �޼ҵ�ȿ��� ����� i��� ������ �޼ҵ�a�ȿ����� ȿ���� ����
		//�׷��Ƿ� �ؿ� �����Լ� �ȿ� for�������� i���� 0���� �ٽ� �ʱ�ȭ �Ǵ�
		//���� ���°�
		//���� i�� a�޼ҵ忡 ���� 0���� ��� �ʱ�ȭ �ȴٸ� 
		//for���� ���ѹݺ��� �ɰ���
		//int k = 5;
		//�̶� k�� ��������(local variable)
		//���� ����+�Ҵ�
		//�޼ҵ�ȿ� ����� ������ ��������
	}
	
	public static void main(String[] args) {
		for (i=0; i<5; i++) {
			a();
			System.out.println(i);
		}
		
	}

}
