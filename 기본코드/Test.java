package baekjoon;

public class Test{
	//Comparable 인터페이스
	public static void main(String[] args) {
		Student2 a = new Student2(17,2);
		Student2 b = new Student2(18,1);
		
		int isBig = a.compareTo(b);
		//isBig = -1
		if(isBig>0) {
			System.out.println("a가 나이가 많아");
		}
		else if(isBig==0) {
			System.out.println("동갑이야");
		}
		else {
			System.out.println("b가 나이가 많아");
		}
	}
	
}

class Student2 implements Comparable<Student2>{
	
	int age;
	int classNumber;
	
	Student2(int age, int classNumber){
		//생성자
		this.age = age;
		this.classNumber = classNumber;
	}
	
	public int compareTo(Student2 o) {
		return this.age-o.age;
	}
}
