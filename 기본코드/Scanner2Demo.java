package org.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		//����ڰ� Ű����� �Է��� �� ����
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			//hasNextInt():�Է°��� ������ true �ƴϸ� false��ȯ
			System.out.println(sc.nextInt()*100);
		}
		sc.close();
	}

}
