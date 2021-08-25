package org.javatutorials.array;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] student = {"tom", "steve", "alex"};
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]+" yes");
		}
		
		/*배열과 for문의 결합이 많이 쓰이므로
		 * for-each구문이라는게 생김 
		 */
		
		for(String e : student) {
			System.out.println(e+" yes!!");
		}//for-each구문 student의 요소를 하나씩 e에 넣어줌
		//기존의 for문 보다 간단하게 해결가능
	}
	
	
	
}
