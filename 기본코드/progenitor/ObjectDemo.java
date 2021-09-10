package org.javatutorials.progenitor;

class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		/*�Ű������� ������ s2�� Ŭ����Ÿ���� Student������
		 * ���� �Ű����� obj�� Ÿ���� Object�̴�.
		 * StudentŬ������ �θ� ObjectŬ������ �����̴�.
		 * �� �ڽ� ������Ÿ���� �θ�����Ÿ�� �ô��� �ؾ���
		 * �츮�� equals��� �޼ҵ带 �������̵����ִ°�
		 * �ؿ� ���θ޼ҵ忡�� �Է¹��� �Ű������� ���ڿ��� ������
		 * �� �ν��Ͻ��� ���ٰ� ������ִ� equals�޼ҵ带 ������ִ°�
		 * �� ���� �� �޼ҵ忡�� Object obj��� �Ű�����(�ν��Ͻ�)����
		 * name�̶�� ������ �����ؾ���
		 * �׷��� ObjectŬ����Ÿ�Կ��� StudentŬ������ ������ name��
		 * �����ϴ°��� �Ұ����ϹǷ� s1,s2��� Object�ν��Ͻ���
		 * StudentŬ����Ÿ������ ��ȯ�������
		 */
		Student s = (Student)obj;//�θ��� Object�� �ڽ��� Student�� �ٲ�
		/*�ڽ��� �θ�� �ٲٴ°� ĳ���þ��� �ڵ����ΰ���
		 * ������ �θ� �ڽ����� �ٲٴ°� �� �ڵ�ó�� ĳ���� �ʿ�
		 * ū->���������� ���ϴ°��̱⶧���� �������� ĳ����������Ѵٰ� ����
		 */
		return this.name==s.name;
		//s1�� name : this.name
		//s2�� name : s.name
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
