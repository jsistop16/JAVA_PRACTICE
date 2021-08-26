package org.javatutorials.io;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.in => 사용자가 입력한 값 이라는 뜻
		 * System.in 자리에 file이 올수도있음
		 * sc라는 변수에 입력값을 저장
		 */
		int i = sc.nextInt();
		/* sc라는 객체는 nextInt라는 메소드를 가지고있는것
		 * 실행이 멈추고 대기하는 상태가 됨(사용자의 입력을 기다림)
		 * int형을 입력받겠다는 뜻
		 * 엔터를 누르는 순간 값이 i에 대입
		 * 다음줄 실행
		 */
		System.out.println(i*5);
		sc.close();
		//sc.close();는 끝맺는 방식
	}

}
