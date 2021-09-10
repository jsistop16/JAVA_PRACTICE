package org.javatutorials.progenitor;
//clone ����
//������ �Ϸ��� �����Ϸ��� Ŭ������ ���������ϴٴ°��� ����������
//�� ����� Cloneable�������̽��� �����ϴ°�
//Cloneable�������̽��� �������� �������
//���� �ش� Ŭ������ ���������ϴٶ�°͸��� ǥ�����ִ� ������ �����ϻ�
class StudentDemo implements Cloneable{
	String name;
	StudentDemo(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clone {

	public static void main(String[] args) {
		StudentDemo s1 = new StudentDemo("jun");
		try {
			StudentDemo s2 = (StudentDemo) s1.clone();//s1�� s2�� ����
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
 