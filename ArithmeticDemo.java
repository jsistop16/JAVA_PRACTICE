package org.javatutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		//���׿�����
		String firststring="this is";
		String secondstring=" java";
		System.out.println(firststring+secondstring);
		
		int a=10;
		float d=3.0F;
		
		System.out.println(a/d);
		/* a�� int d�� float�̹Ƿ� ������ �����Ҷ�
		 * int���� float���� �ڵ�����ȯ �Ͼ
		 * �׷� a/d�� ����� float�ڷ������� ����
		 */
		
		//���׿����� Ȱ��
		int i =3;
		i++;
		System.out.println(i); //4
		System.out.println(++i); //5
		System.out.println(i++); //5
		System.out.println(i); //6
		System.out.println(-i); //-6
		
		System.out.println(System.getProperty("user.dir"));
	}

}
