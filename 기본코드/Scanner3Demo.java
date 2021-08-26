package org.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		//���Ͼȿ� ����Ǿ��ִ� �����͸� �Է°����� �������� ����
		try {//����ó��
			File file = new File("output.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {//����ó��(��������Ȯ��)
			e.printStackTrace();
		}
	}

}
