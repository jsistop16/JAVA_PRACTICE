package org.javatutorials.generic;
//복수 제네릭
//제네릭은 클래스에서 뿐만아니라 메소드 차원에서도 사용할수있다.
class Employee_Info{
	public int rank;
	Employee_Info(int rank){
		this.rank = rank;
	}
}

class Person_Info<T, S>{//T,S자리에는 참조형 데이터타입만 올수있음 기본데이터타입은 불가
	//기본데이터타입을 쓰고 싶다면 wrapper class를 사용해야함
	//int는 Integer, double은 Double 
	public T info;
	public S id;
	Person_Info(T info, S id){
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		
		System.out.println(info);
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		Integer id = new Integer(1);//int라는 기본데이터 타입을 wrapper class를 이용하여 객체(id)로 만들어줌
		//밑에 줄 맨끝에 id 대신 숫자 1 대입해도 상관없음
		Person_Info<Employee_Info, Integer> p1 = new Person_Info<Employee_Info, Integer>(new Employee_Info(1), id);
		//T, S 에 들어가는 데이터 타입을 미리 정해둔다면 <Employee_Info, Integer>를 써줄 필요없음 (바로 밑에 주석코드)
		/*Employee_Info e = new Employee_Info();
		 *Person_Info i = new Person_Info();
		 *Person_Info p1 = new Person_Info(e,i);
		 *e,i의 데이터 타입을 알기떄문에 java도 이를 인식함
		 */
		Employee_Info e = new Employee_Info(1);
		System.out.println(p1.id.intValue());
		p1.<Employee_Info>printInfo(e);
	}

}
