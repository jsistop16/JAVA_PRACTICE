package baekjoon;

public class Test{
	//Comparable �������̽�
	public static void main(String[] args) {
		Student2 a = new Student2(17,2);
		Student2 b = new Student2(18,1);
		
		int isBig = a.compareTo(b);
		//isBig = -1
		if(isBig>0) {
			System.out.println("a�� ���̰� ����");
		}
		else if(isBig==0) {
			System.out.println("�����̾�");
		}
		else {
			System.out.println("b�� ���̰� ����");
		}
	}
	
}

class Student2 implements Comparable<Student2>{
	
	int age;
	int classNumber;
	
	Student2(int age, int classNumber){
		//������
		this.age = age;
		this.classNumber = classNumber;
	}
	
	public int compareTo(Student2 o) {
		return this.age-o.age;
	}
}
