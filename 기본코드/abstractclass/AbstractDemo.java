package org.javatutorials.abstractclass;

abstract class A{
	//Ŭ���� ���(�޼ҵ�)�߿� �ϳ��� abstract���
	//�� Ŭ���� ���� abstract��
	public abstract void b();
	/*public abstract int c() {
		System.out.println("Hello");
		//����: abstract���� ����� c��� �޼ҵ� �ȿ�
		//��ü���� ������ ������
		//�߻�޼ҵ�� �� �ȿ� ������ ��������
		//���� b�޼ҵ� ó�� �߰�ȣ�� �ƿ��������
	}*/
	public void d() {
		/*�߻� Ŭ���� A�� �޼ҵ� dó�� ��ü(�߰�ȣ)�� ������
		 * �޼ҵ带 ������ ����
		 */
		System.out.println("world");
	}
}

class B extends A{
	public void b() {
		//�߻�޼ҵ��� b�� �������̵�
		System.out.println("world");
		/*AŬ�������� b�޼ҵ��� ������ �������� ���߱⋚����
		 * A�� ��ӹ��� Ŭ���� B���� �޼ҵ� b�� ���� ��ü��
		 * ��������� ��
		 */
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		//A obj = new A();
		//�߻� Ŭ���� A�� ��ü ���� �Ұ�
		B obj = new B();
		//��ӹ��� BŬ������ ��ü ����
		obj.b();
		obj.d();
	}

}

//�� ���� abstract��� Ű���带 ����ؼ� �� 
//����� �޾ƾ߸� ��밡���� Ŭ������ ����ϴ°��ΰ�?
//������
//����Ⱥκ��� �߻�Ŭ������ �־�ΰ� ������ ����� �޶���ϴºκ���
//�߻�޼ҵ� �������̵��� ���� ÷�����ָ� �Ǵ°��̴�.