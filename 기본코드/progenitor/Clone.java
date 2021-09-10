package org.javatutorials.progenitor;
//clone 예제
//복제를 하려면 복제하려는 클래스가 복제가능하다는것을 명시해줘야함
//그 방법이 Cloneable인터페이스를 구현하는것
//Cloneable인터페이스는 눌러보면 비어있음
//단지 해당 클래스가 복제가능하다라는것만을 표현해주는 구분자 역할일뿐
class StudentDemo implements Cloneable{
	String name;
	StudentDemo(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clone {

	public static void main(String[] args) {
		StudentDemo s1 = new StudentDemo("jun");
		try {
			StudentDemo s2 = (StudentDemo) s1.clone();//s1을 s2에 복제
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
 