package org.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		//파일안에 저장되어있는 데이터를 입력값으로 가져오는 예제
		try {//예외처리
			File file = new File("output.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {//예외처리(오류내용확인)
			e.printStackTrace();
		}
	}

}
