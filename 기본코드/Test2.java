package baekjoon;

import java.util.Comparator;

public class Test2 {
	//Comparator 인터페이스
	public static void main(String[] args) {
		Student a = new Student(17,2);
		Student b = new Student(18,1);
		Student c = new Student(15,3);
		
		int isBig = a.compare(b,c);
		//a와 상관없이 b와 c를 비교하는 메소드인겁니다.
		
		if(isBig<0) {
			System.out.println("b가 c보다 반이 크다");
		}
		else if(isBig==0) {
			System.out.println("b와 c는 반이 같다");
		}
		else {
			System.out.println("c가 b보다 반이 크다");
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