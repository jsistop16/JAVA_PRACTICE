package baekjoon;

import java.util.Comparator;

public class Test2 {
	//Comparator �������̽�
	public static void main(String[] args) {
		Student a = new Student(17,2);
		Student b = new Student(18,1);
		Student c = new Student(15,3);
		
		int isBig = a.compare(b,c);
		//a�� ������� b�� c�� ���ϴ� �޼ҵ��ΰ̴ϴ�.
		
		if(isBig<0) {
			System.out.println("b�� c���� ���� ũ��");
		}
		else if(isBig==0) {
			System.out.println("b�� c�� ���� ����");
		}
		else {
			System.out.println("c�� b���� ���� ũ��");
		}
	}

}

class Student implements Comparator<Student>{
	int age;
	int classNumber;
	
	Student(int age, int classNumber){
		this.age = age;
		this.classNumber = classNumber;
	}
	
	public int compare(Student o1, Student o2) {
		if(o1.classNumber > o2.classNumber) {
			return -1;
		}
		
		else if(o1.classNumber == o2.classNumber) {
			return 0;
		}
		
		else {
			return 1;
		}
	}
	
}