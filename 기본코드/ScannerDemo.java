package org.javatutorials.io;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.in => ����ڰ� �Է��� �� �̶�� ��
		 * System.in �ڸ��� file�� �ü�������
		 * sc��� ������ �Է°��� ����
		 */
		int i = sc.nextInt();
		/* sc��� ��ü�� nextInt��� �޼ҵ带 �������ִ°�
		 * ������ ���߰� ����ϴ� ���°� ��(������� �Է��� ��ٸ�)
		 * int���� �Է¹ްڴٴ� ��
		 * ���͸� ������ ���� ���� i�� ����
		 * ������ ����
		 */
		System.out.println(i*5);
		sc.close();
		//sc.close();�� ���δ� ���
	}

}
