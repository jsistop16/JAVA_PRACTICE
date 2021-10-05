package org.javatutorials.generic;

abstract class InfoDemo{
	public abstract int getLevel();
	//�߻�޼ҵ� ���� �����ʼ�
}

class EmployeeInfoDemo extends InfoDemo{
	public int rank;
	EmployeeInfoDemo(int rank){
		//������
		this.rank = rank;
	}
	public int getLevel() {
		//�߻�Ŭ���� ���� ����
		return this.rank;
	}
}

class Person<T extends InfoDemo>{
	//T��� ������Ÿ���� InfoDemo�� �ڽĵ����� Ÿ�Ը� �����ϰԲ� ����
	//InfoDemo�� �ڽ� = EmployeeInfoDemo
	public T info;
	Person(T info){
		this.info = info;
	}
}

public class GenericExtend {

	public static void main(String[] args) {
		Person<EmployeeInfoDemo> p1 = new Person<EmployeeInfoDemo>(new EmployeeInfoDemo(1));
		//���׸� ���� ����: �ν��Ͻ�ȭ �Ҷ� ������ Ÿ���� �����ִ°�(�������� �������̱⵵ ��)
		//�׷��ٺ��� �°� ������ Ÿ���� �� ���ü��ִ� �������� ����
		//�׷��� extends��� Ű���带 �̿��Ͽ� ������ Ÿ���� �������ټ� �ִ°�
		//EmployeeInfoDemo�� InfoDemo�� �ڽ��̹Ƿ� ����
		/*Person<String> p2 = new Person<String>("����");*/
		//String�� InfoDemo�� �ڽ�Ÿ���� �ƴϹǷ� compile error
		System.out.println(p1.info);
	}

}
