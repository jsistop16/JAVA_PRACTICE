package org.javatutorials.constant;

class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}

class Company{
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		
		if (Fruit.APPLE == Company.APPLE) {
			//�ΰ��� Ŭ����Ÿ���� ���� Fruit�� Company�� �ٸ��⋚���� ���� �߻�
			System.out.println("���Ͼ��ð� ��������� �����ϴ�.");
		}
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		//type�� Ÿ���� Fruit�̹Ƿ� switch���� ��������
		//Ÿ���̱� ������ �����߻�
		//�̰��� �ذ�å�� enum
		//ConstantDemo3
		case Fruit.APPLE:
			System.out.println(57+"kcal");
			break;
		case Fruit.PEACH:
			System.out.println(34+"kcal");
			break;
		case Fruit.BANANA:
			System.out.println(93+"kcal");
			break;
		}
	}
	

}
