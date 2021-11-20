package baekjoon;
import java.util.Comparator;
public class Test_annonymous_comparator {
	//익명객체로 comparator에서 비교기능만 따로 구현해보기
	//나이를 기준으로 할건지, 학급을 기준으로 할건지
	//기준을 따로 정할수 있따는 장점
	//temp1: 나이기준 비교
	//temp2: 학급기준 비교
	public static void main(String[] args) {
		Student_annonymous sa1 = new Student_annonymous(17,2);
		Student_annonymous sa2 = new Student_annonymous(18,1);
		
		int isAgeBig = temp1.compare(sa1, sa2);
		if(isAgeBig > 0) {
			System.out.println("sa1의 나이가 더 많다.");
		}
		else if(isAgeBig == 0) {
			System.out.println("동갑이다.");
		}
		else {
			System.out.println("sa2의 나이가 더 많다.");
		}
		
		int isClassBig = temp2.compare(sa1, sa2);
		if(isClassBig>0) {
			System.out.println("sa1의 반이 더 높다");
		}
		else if(isClassBig == 0) {
			System.out.println("반이 같다.");
		}
		else {
			System.out.println("sa2의 반이 더 높다");
		}
		
	}
	
	public static Comparator<Student_annonymous> temp1 = new Comparator<Student_annonymous>() {
		//나이 대소비교
		public int compare(Student_annonymous o1, Student_annonymous o2) {
			return o1.age-o2.age;
		}
	};
	
	public static Comparator<Student_annonymous> temp2 = new Comparator<Student_annonymous>() {
		//반 대소비교
		public int compare(Student_annonymous o1, Student_annonymous o2) {
			return o1.classNumber-o2.classNumber;
		}
	};
}

class Student_annonymous{
	//Comparator를 따로 구현할필요없음
	int age;
	int classNumber;
	
	Student_annonymous(int age, int classNumber){
		this.age = age;
		this.classNumber = classNumber;
	}
}
