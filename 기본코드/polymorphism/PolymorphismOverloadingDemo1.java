package org.javatutorials.polymorphism;
//������ ����(�������̵����� �����ϴ°� ���� �����ҵ�)
class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String x() {//overriding
		return "B.x";
	}
	public String y() {
		return "y";
	}
}


class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismOverloadingDemo1 {

	public static void main(String[] args) {
		//����1
		A obj = new B();
		/*Ŭ���� B�� obj��� ������ �ν��Ͻ�ȭ ���װ�
		*obj��� ������ Ŭ����Ÿ���� A�̴�.
		*obj�� A�༼�� �ϰ��ִ°�
		*/
		obj.x();//A�ȿ� �޼ҵ�� ���� ����
		//obj.y();//�����߻� A�ȿ� y�޼ҵ� ����
		System.out.println(obj.x());
		//�� ������ B.x�� ��ȯ��
		/*AŬ���� �༼�� �ϰ��ִ� obj�� A�� ���� �޼ҵ�� ����Ұ�
		 *������ AŬ���� �ȿ��ִ� �޼ҵ尡 �ٸ�Ŭ������ �������̵��ƴٸ�
		 *�� �������̵��� �޼ҵ尡 ����ȴ�.
		 */
		
		 //����2
		A obj2 = new B2();
		/*obj2�� A�� �ν��Ͻ���� ����
		 * A�� �ִ� �޼ҵ� x()�� ���డ��
		 * ������ B2���� x()�޼ҵ尡 �������̵���
		 * �׷��Ƿ� A�� �ν��Ͻ������� B2�� �޼ҵ尡 �����
		 */
		System.out.println(obj2.x());
		//�׷��Ƿ� B2.x�� ��µ�
	}

}
