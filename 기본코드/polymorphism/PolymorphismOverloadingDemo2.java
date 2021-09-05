//������ ���� ��ü����
//ī��A,B���ְ�
//���� �޴��� �Ƹ޸�ī��, �� 2���� ����
//�� ī��A�� light, ī�� B�� dark
//����� ������ ī�信�� �ֹ��� ���ᰡ ���� ��� ���

package org.javatutorials.polymorphism;
//�������̽� ����

/*interface menu{
	public String americano();
	public String latte();
}

class Ab implements menu{
	public String americano() {
		return "light";
	}
	public String latte() {
		return "light";
	}
}

class Ba implements menu{
	public String americano() {
		return "dark";
	}
	public String latte() {
		return "dark";
	}
}
public class PolymorphismOverloadingDemo2 {

	public static void main(String[] args) {
		Ab obja = new Ab();
		Ba objb = new Ba();
		
		System.out.println(obja.americano());
		System.out.println(obja.latte());
		System.out.println(objb.americano());
		System.out.println(objb.latte());
		
	}

}*/

//������ ����
class Menu{
	public void americano();
	public void latte();
}

class CafeA extends Menu{
	public void americano() {
		System.out.println("light");
	}
	public void latte() {
		System.out.println("light");
	}
}

class CafeB extends Menu{
	public void americano() {
		System.out.println("dark");
	}
	public void latte() {
		System.out.println("dark");
	}
}

public class PolymorphismOverloadingDemo2{
	public static void main(String[] args) {
		Menu ca = new CafeA();
		Menu cb = new CafeB();
		
		ca.americano();
		cb.latte();
	}
}