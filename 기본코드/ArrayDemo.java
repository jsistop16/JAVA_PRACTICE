package org.javatutorials.array;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] student = {"tom", "steve", "alex"};
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]+" yes");
		}
		
		/*�迭�� for���� ������ ���� ���̹Ƿ�
		 * for-each�����̶�°� ���� 
		 */
		
		for(String e : student) {
			System.out.println(e+" yes!!");
		}//for-each���� student�� ��Ҹ� �ϳ��� e�� �־���
		//������ for�� ���� �����ϰ� �ذᰡ��
	}
	
	
	
}
