package org.javatutorials.generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}


class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person{
	public Object info;
	//Ŭ����Ÿ���� Object�� ����
	//StudentInfo�� EmployeeInfo��θ� ���� info��� �����̹Ƿ�
	//�� �� Ŭ������ ���������� Object�� Ŭ����Ÿ������ ������
	//�����
	Person(Object info){
		this.info = info;
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		Person p1 = new Person("����");
		/*�����ڿ��� �Ű������� "����"�̶�� String�� �����Ͱ� ���µ�
		 * ������ �߻����� ����
		 * Person�̶�� Ŭ����Ÿ���� �������� �Ű������� ObjectŬ����Ÿ����
		 * �� info��� ������ Object�� �ްԵǸ鼭 ��ü�� �����Ҷ�
		 * String�� �����͵� �������ְԵǹ�����(��� ������Ÿ�� ����)
		 * �̰��� "Ÿ���� �������� �ʴ�"��� ǥ����
		 * �̰��� �ڹٿ��� ���ɼ� ���� ��
		 * �׷��� generic�� ����
		 * �� ���׸��� �ڵ��� �ߺ��� Ÿ���� ������ �θ��� �䳢�� ��� ���
		 */
		EmployeeInfo ei = (EmployeeInfo) p1.info;
		System.out.println(ei.rank);
	}

}
