package org.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		//사용자가 키보드로 입력한 값 예제
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			//hasNextInt():입력값이 정수면 true 아니면 false반환
			System.out.println(sc.nextInt()*100);
		}
		sc.close();
	}

}
