package org.javatutorials.accessmodifier;

class A{
	public String y() {
		return "public method y()";
	}
	
	private String z() {
		return "private method z()";
	}
	
	public String x() {
		return z();
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		// public method y() ���
		//System.out.println(a.z());
		//����(z�� private�̱� ������ �ٸ� Ŭ�������� ������ �� ����)
		System.out.println(a.x());
		// private method z() ��� 
		//x��� �޼ҵ�� z�޼ҵ�� ���� Ŭ������ �ֱ⋚����
		//z�޼ҵ忡 ���� ������
	}

}
