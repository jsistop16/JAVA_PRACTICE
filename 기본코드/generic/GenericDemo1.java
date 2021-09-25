package org.javatutorials.generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class StudentPerson{
	public StudentInfo info;
	StudentPerson (StudentInfo info){
		this.info = info;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class EmployeePerson{
	//위에 StudentPerson과 기능이 동일한 메소드
	//중복이 발생함
	//GenericDemo2클래스에서 해결
	//StudentPerson과 EmployeePerson클래스를
	//Person클래스로 합침
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){
		this.info = info;
	}
}

public class GenericDemo1 {

	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);//2
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank);//1
	}

}
