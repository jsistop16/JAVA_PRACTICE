package org.javatutorials.collection;

import java.util.ArrayList;
//ArrayList�� ����Ҷ��� �׻� import�������

public class ArrayListDemo {
	//�迭�� �������ٶ� ũ�⸦ �̸� �������ְų�
	//�׷����� ũ�⸦ �𸦶� ����ϱ� ��ƴٴ� ������ �����ϱ� ����
	//���°��� ArrayList�̹Ƿ� ArrayList�� ó�� ����� ũ�⸦ ��������X
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");//index:0
		al.add("two");//index:1
		al.add("three");//index:2
		//���Ҹ� �ƹ��� ���� �߰��ص� ������ �߻����� ����
		//add��� �޼ҵ带 ���� ���Ҹ� �߰��Ҽ�����
		for (int i=0; i<al.size(); i++) {
			/*String value = (String)al.get(i);
			//al.get()�� ���ؼ� return�Ǵ� ���� Object������Ÿ���̹Ƿ�
			//String value�� �����Ҽ�����
			//�׷��Ƿ� (String)���� ĳ���� �������
			//�׷��� ������ ���׸��� �̿��Ͽ� <String>���� ��������
			*/
			System.out.println(al.get(i));
			//get�޼ҵ带 ���� ���� ���
		}
		/*String a = "one";
		Object b = "two";
		String c;
		Object d;
		c=b;
		d=a;
		String->Object���� ������ ����
		Object->String������ ������ �Ұ�
		Object�� �����̱⋚��
		29line error*/
		
	}

}
