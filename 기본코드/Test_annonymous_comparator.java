package baekjoon;
import java.util.Comparator;
public class Test_annonymous_comparator {
	//�͸�ü�� comparator���� �񱳱�ɸ� ���� �����غ���
	//���̸� �������� �Ұ���, �б��� �������� �Ұ���
	//������ ���� ���Ҽ� �ֵ��� ����
	//temp1: ���̱��� ��
	//temp2: �бޱ��� ��
	public static void main(String[] args) {
		Student_annonymous sa1 = new Student_annonymous(17,2);
		Student_annonymous sa2 = new Student_annonymous(18,1);
		
		int isAgeBig = temp1.compare(sa1, sa2);
		if(isAgeBig > 0) {
			System.out.println("sa1�� ���̰� �� ����.");
		}
		else if(isAgeBig == 0) {
			System.out.println("�����̴�.");
		}
		else {
			System.out.println("sa2�� ���̰� �� ����.");
		}
		
		int isClassBig = temp2.compare(sa1, sa2);
		if(isClassBig>0) {
			System.out.println("sa1�� ���� �� ����");
		}
		else if(isClassBig == 0) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("sa2�� ���� �� ����");
		}
		
	}
	
	public static Comparator<Student_annonymous> temp1 = new Comparator<Student_annonymous>() {
		//���� ��Һ�
		public int compare(Student_annonymous o1, Student_annonymous o2) {
			return o1.age-o2.age;
		}
	};
	
	public static Comparator<Student_annonymous> temp2 = new Comparator<Student_annonymous>() {
		//�� ��Һ�
		public int compare(Student_annonymous o1, Student_annonymous o2) {
			return o1.classNumber-o2.classNumber;
		}
	};
}

class Student_annonymous{
	//Comparator�� ���� �������ʿ����
	int age;
	int classNumber;
	
	Student_annonymous(int age, int classNumber){
		this.age = age;
		this.classNumber = classNumber;
	}
}
